public class Secretario extends Funcionario{
    @Override
    public double getBonificacao() {
        return super.getSalario() * 0.15;
    }
}
