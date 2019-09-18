import java.util.Calendar;

public class Contrato {

    private Calendar data;
    private String nome;
    private TipoContratoEnum tipo;

    public Contrato(Calendar data, String nome, TipoContratoEnum tipo) {
        this.data = data;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Calendar getData() {
        return data;
    }

    public String getNome() {
        return nome;
    }

    public TipoContratoEnum getTipo() {
        return tipo;
    }

    public void avanca() {
        if(tipo == TipoContratoEnum.NOVO) tipo = TipoContratoEnum.EM_ANDAMENTO;
        else if(tipo == TipoContratoEnum.EM_ANDAMENTO) tipo = TipoContratoEnum.ACERTADO;
        else if(tipo == TipoContratoEnum.ACERTADO) tipo = TipoContratoEnum.CONCLUIDO;
    }

    public Estado salvaEstado() {
        return new Estado(new Contrato(data, nome, tipo));
    }

    public void restaura(Estado estado) {
        this.data = estado.getContrato().getData();
        this.nome = estado.getContrato().getNome();
        this.tipo = estado.getContrato().getTipo();
    }
}
