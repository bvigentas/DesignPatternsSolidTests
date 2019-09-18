import javax.swing.*;
import java.util.Collections;
import java.util.List;

public class Fatura {
    private List<Pagamento> pagamentos;

    public List<Pagamento> getPagamentos() {
        return Collections.unmodifiableList(pagamentos);
    }

    public void adicionaPagamento(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
    }
}
