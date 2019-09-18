public class Main {

    public static void main(String[] args) {

        Expressao soma1 = new Soma(new Numero(5),new Numero(10));
        Expressao soma2 = new Soma(new Numero(4),new Numero(10));

        Expressao conta = new Soma(soma1, soma2);

        int resultado = conta.avaliar();
        System.out.println(resultado);
    }

}
