public class Multiplicacao implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public Expressao getEsquerda() {
        return esquerda;
    }

    public Expressao getDireita() {
        return direita;
    }

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

    @Override
    public void aceita(Visitor visitor) {
        visitor.visitarMultiplicacao(this);
    }
}
