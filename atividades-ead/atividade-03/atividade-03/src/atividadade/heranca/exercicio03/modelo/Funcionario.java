package atividadade.heranca.exercicio03.modelo;

public class Funcionario extends Pessoa {
    private String matricula;
    private Double salario;

    public Funcionario() {
        super();
        this.matricula = "";
        this.salario = 0.0;
    }

    public Funcionario(String nome, String sobreNome, String matricula, Double salario) {
        super(nome, sobreNome);
        this.matricula = matricula;
        this.salario = salario;
    }
   /* Todo funcionario recebe seu salário em duas parcelas, sendo 60% na primeira parcela e 40% na
    segunda parcela. Assim, escreva os métodos: */
    public Double getSalarioPrimeiraParcela() {
        return this.salario * 0.6;
    }
    public Double getSalarioSegundaParcela() {
        return this.salario * 0.4;
    }


    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getSalario() {
        return this.salario;
    }

    /*Atribui ao atributo salário o valor recebido como parâmetro desde que
    este valor não seja negativo. Caso seja negativo, não faz nada.*/
    public void setSalario(Double valor) {
        if (valor > 0) {
            this.salario += valor;
        } else {
            System.out.println("Valor inválido");
        }
    }

}
