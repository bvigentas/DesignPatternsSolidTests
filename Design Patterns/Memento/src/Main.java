import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Historico historico = new Historico();

        Contrato contrato = new Contrato(Calendar.getInstance(), "Mauricio", TipoContratoEnum.NOVO);
        historico.add(contrato.salvaEstado());

        contrato.avanca();
        historico.add(contrato.salvaEstado());

        contrato.avanca();
        historico.add(contrato.salvaEstado());

        contrato.avanca();
        historico.add(contrato.salvaEstado());

        contrato.restaura(historico.getEstado(1));
    }
}