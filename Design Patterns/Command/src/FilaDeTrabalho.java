import java.util.List;

public class FilaDeTrabalho {

    private List<Comando> comandos;

    public void adiciona(Comando comando) {
        this.comandos.add(comando);
    }

    public void processar() {
        for (Comando comando :
                comandos) {
            comando.executa();
        }
    }
}