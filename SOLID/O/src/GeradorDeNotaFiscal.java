import java.util.List;

public class GeradorDeNotaFiscal {

    private List<AcoesAposGeracao> acoes;

    public GeradorDeNotaFiscal(List<AcoesAposGeracao> acoes) {
        this.acoes = acoes;
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal();

        for (AcoesAposGeracao acao:
             acoes) {
            acao.executa(nf);
        }

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}