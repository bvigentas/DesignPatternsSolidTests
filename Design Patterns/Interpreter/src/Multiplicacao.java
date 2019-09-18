public class Multiplicacao implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public Multiplicacao(Expressao esquerda, Expressao direita) {
        this.direita = direita;
        this.esquerda = esquerda;
    }

    @Override
    public int avaliar() {
        int resultEsquerda = esquerda.avaliar();
        int resultDireita = direita.avaliar();
        return resultEsquerda * resultDireita;
    }
}
