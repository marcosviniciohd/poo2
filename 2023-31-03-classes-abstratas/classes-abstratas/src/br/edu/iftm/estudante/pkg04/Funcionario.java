package br.edu.iftm.estudante.pkg04;

public abstract class Funcionario {
    private double salario;

    private double horasTrabalhadas;

    public Funcionario(double salario, double horasTrabalhadas) {
        this.salario = salario;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalario(){
        return this.salario * this.horasTrabalhadas;
    }
}
