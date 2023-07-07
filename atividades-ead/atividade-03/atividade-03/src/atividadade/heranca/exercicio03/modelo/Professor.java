package atividadade.heranca.exercicio03.modelo;

public class Professor extends Funcionario {
    public Professor() {
        super();
    }
    public Professor(String nome, String sobreNome, String matricula, Double salario) {
        super(nome, sobreNome, matricula, salario);
    }

     /*c) Uma subclasse de Funcionario, chamada Professor. Todo professor recebe seu salário em
    uma única parcela. Assim, deve-se sobrescrever os métodos getSalarioPrimeiraParcela e
    getSalarioSegundaParcela.*/
    @Override
    public Double getSalarioPrimeiraParcela() {
        return this.getSalario();
    }
    @Override
    public Double getSalarioSegundaParcela() {
        return 0.0;
    }

}
