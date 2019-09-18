public class Soma implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public Soma(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avaliar() {
        int resultadoEsquerda = esquerda.avaliar();
        int resultadoDireita = direita.avaliar();
        return resultadoDireita + resultadoEsquerda;
    }
}
