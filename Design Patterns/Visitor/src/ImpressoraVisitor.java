public class ImpressoraVisitor implements Visitor{

    @Override
    public void visitarSoma(Soma soma) {
        System.out.print("(");
        soma.getEsquerda().aceita(this);
        System.out.print(" + ");
        soma.getDireita().aceita(this);
        System.out.print(")");
    }

    @Override
    public void visitarDivisao(Divisao divisao) {
        System.out.print("(");
        divisao.getDividendo().aceita(this);
        System.out.print(" / ");
        divisao.getDivisor().aceita(this);
        System.out.print(")");
    }

    @Override
    public void visitarMultiplicacao(Multiplicacao multiplicacao) {
        System.out.print("(");
        multiplicacao.getEsquerda().aceita(this);
        System.out.print(" * ");
        multiplicacao.getDireita().aceita(this);
        System.out.print(")");
    }

    @Override
    public void visitarNumero(Numero numero) {
        System.out.print(numero.getNumero());
    }
}
