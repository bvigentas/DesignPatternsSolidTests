public class Soma implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public Expressao getEsquerda() {
        return esquerda;
    }

    public Expressao getDireita() {
        return direita;
    }

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

    @Override
    public void aceita(Visitor visitor) {
        visitor.visitarSoma(this);
    }
}
