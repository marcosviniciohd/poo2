package br.edu.iftm.estudante.pkg05;

public class Vestuario extends Produto{
    public Vestuario(double preco) {
        super(preco);
    }

    @Override
    public double calcularDesconto(){
        return this.getPreco() * 0.3;
    }
}
