package br.edu.iftm.estudante.pkg05;

public abstract class Produto {
    private double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularDesconto(){
        return this.preco * 0.1;
    }
}
