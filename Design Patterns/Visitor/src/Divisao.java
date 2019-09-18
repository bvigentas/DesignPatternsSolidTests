public class Divisao implements Expressao {

    private Expressao dividendo;
    private Expressao divisor;

    public Expressao getDividendo() {
        return dividendo;
    }

    public Expressao getDivisor() {
        return divisor;
    }

    public Divisao(Expressao dividendo, Expressao divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    @Override
    public int avaliar() {
        int resultDividendo = dividendo.avaliar();
        int resultDivisor = divisor.avaliar();
        return resultDividendo / resultDivisor;
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.visitarDivisao(this);
    }
}
