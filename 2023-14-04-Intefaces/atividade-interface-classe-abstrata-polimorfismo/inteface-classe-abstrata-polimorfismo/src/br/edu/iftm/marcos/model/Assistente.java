package br.edu.iftm.marcos.model;

public class Assistente extends Funcionario {

    private double adicional;

    public Assistente(String nome, String matricula, double salario_base, double adicional) {
        super(nome, matricula, salario_base);
        this.adicional = adicional;
    }

    public Assistente() {
    }

    @Override
    public double calculaSalario() {
        return getSalario_base() * adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
}
