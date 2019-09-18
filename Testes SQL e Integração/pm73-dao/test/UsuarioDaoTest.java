import br.com.caelum.pm73.dao.CriadorDeSessao;
import br.com.caelum.pm73.dao.UsuarioDao;
import br.com.caelum.pm73.dominio.Usuario;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UsuarioDaoTest {

    private Session session;

    @Before
    public void inicia() {
        session = new CriadorDeSessao().getSession();
        session.beginTransaction();
    }

    @After
    public void finaliza() {
        //Faz rowback para que o que foi inserido nos testes nao fique sujando o banco
        session.getTransaction().rollback();
        session.close();
    }

    @Test
    public void porNomeEEmail() {
        UsuarioDao usuarioDao = new UsuarioDao(session);

        Usuario usuario = new Usuario("João", "joão@gmail.com");
        usuarioDao.salvar(usuario);

        Usuario usuarioBanco = usuarioDao.porNomeEEmail("João", "joão@gmail.com");

        Assert.assertEquals("João", usuarioBanco.getNome());
        Assert.assertEquals("joão@gmail.com", usuarioBanco.getEmail());

    }

    @Test
    public void delete() {
        UsuarioDao usuarioDao = new UsuarioDao(session);

        Usuario usuario = new Usuario("João", "joão@gmail.com");
        usuarioDao.salvar(usuario);

        usuarioDao.deletar(usuario);

        session.flush();
        session.clear();

        Usuario usuarioBanco = usuarioDao.porNomeEEmail("João", "joão@gmail.com");

        Assert.assertNull(usuarioBanco);
    }
}
