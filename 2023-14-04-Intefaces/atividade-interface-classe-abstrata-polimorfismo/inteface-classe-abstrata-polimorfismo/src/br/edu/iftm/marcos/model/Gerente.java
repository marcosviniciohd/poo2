package br.edu.iftm.marcos.model;

public class Gerente extends Funcionario {

    private double bonus;

    public Gerente(String nome, String matricula, double salario_base, double bonus) {
        super(nome, matricula, salario_base);
        this.bonus = bonus;
    }

    public Gerente() {
    }

    @Override
    public double calculaSalario() {
        return getSalario_base() * bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

