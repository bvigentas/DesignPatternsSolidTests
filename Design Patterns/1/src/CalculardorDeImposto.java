public class CalculardorDeImposto {
    public void realizaCalculo(Orcamento orcamento, String imposto) {
        if (imposto.equals("ICMS")) {
            double icms = orcamento.getValor() * 0.1;
        }
    }
}
