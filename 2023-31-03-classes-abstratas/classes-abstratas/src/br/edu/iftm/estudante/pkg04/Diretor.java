package br.edu.iftm.estudante.pkg04;

public class Diretor extends Funcionario{

    public Diretor(double salario, double horasTrabalhadas) {
        super(salario, horasTrabalhadas);
    }

    @Override
    public double calcularSalario(){
        return super.calcularSalario() + 300;
    }
}
