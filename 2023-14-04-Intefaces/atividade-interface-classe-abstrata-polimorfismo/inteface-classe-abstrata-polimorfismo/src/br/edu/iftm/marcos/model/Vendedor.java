package br.edu.iftm.marcos.model;

public class Vendedor extends Funcionario {

    private double comissao;

    public Vendedor(String nome, String matricula, double salario_base, double comissao) {
        super(nome, matricula, salario_base);
        this.comissao = comissao;
    }

    public Vendedor() {
    }

    @Override
    public double calculaSalario() {
        return getSalario_base() * comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
