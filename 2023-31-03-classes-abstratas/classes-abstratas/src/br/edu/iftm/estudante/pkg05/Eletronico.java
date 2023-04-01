package br.edu.iftm.estudante.pkg05;

public class Eletronico extends Produto{
    public Eletronico(double preco) {
        super(preco);
    }

    @Override
    public double calcularDesconto(){
        return this.getPreco() * 0.2;
    }
}
