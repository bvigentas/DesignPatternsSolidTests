/**
 * Design Pattern VISITOR.
 * Usado para percorrer a arvore executnado alguma ação.
 *
 * O Hibernate usa isso para criar o SQL de consultar HQL.
 *
 *
 *
 * Precisamos de alguma forma fazer com que, se o nó for Soma, ele deve executar o visitaSoma, e assim por diante.
 *
 * Uma maneira de resolver isso, é criar um método dentro de cada Expressao, que invocará o método certo na Impressora
 */
public interface Visitor {
    void visitarSoma(Soma soma);
    void visitarDivisao(Divisao divisao);
    void visitarMultiplicacao(Multiplicacao multiplicacao);
    void visitarNumero(Numero numero);
}
