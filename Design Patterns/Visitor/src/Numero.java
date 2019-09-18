public class Numero implements Expressao {

    /**
     * Design Pattern INTERPRETER
     * Interpreta em castata subindo uma árvore.
     */
    private int numero;

    public int getNumero() {
        return numero;
    }

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int avaliar() {
        return this.numero;
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.visitarNumero(this);
    }
}
