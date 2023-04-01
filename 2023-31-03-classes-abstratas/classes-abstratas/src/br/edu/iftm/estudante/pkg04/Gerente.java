package br.edu.iftm.estudante.pkg04;

public class Gerente extends Funcionario{

    public Gerente(double salario, double horasTrabalhadas) {
        super(salario, horasTrabalhadas);
    }

    @Override
    public double calcularSalario(){
        return super.calcularSalario() + 200;
    }
}

