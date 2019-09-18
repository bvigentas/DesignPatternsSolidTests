import java.util.Calendar;

/**
 * Design Pattern COMMAND
 * Bom quando temos uma fila de execução. Guardamos o comando em uma fila onde cada item sabe qual comando deve chamar pois está
 * implementando uma interface.
 */

public class Pedido {

    private String cliente;
    private double valor;
    private Status status;
    private Calendar dataFinalizacao;


    public Pedido(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    public void paga() {
        status = Status.PAGO;
    }

    public void finaliza() {
        dataFinalizacao = Calendar.getInstance();
        status = Status.ENTREGUE;
    }
}