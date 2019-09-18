public class CalculadoraDeSalario implements RegraDeCalculo {
    @Override
    public double calcula(Funcionario funcionario) {
        return funcionario.calcularSalario();
    }
}
