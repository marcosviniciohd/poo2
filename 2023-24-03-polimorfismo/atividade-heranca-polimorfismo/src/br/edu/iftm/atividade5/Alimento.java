package br.edu.iftm.atividade5;

public class Alimento extends Produto {
    private String validade;
    private String marca;

    public Alimento(String nome, double preco, String validade, String marca) {
        super(nome, preco);
        this.validade = validade;
        this.marca = marca;
    }

    public Alimento() {
    }

    @Override
    public double calcularDesconto(double descontoEmPorcentagem) {
        System.out.println("Produto de alimento recebe desconto limitado à 2%");
        if (descontoEmPorcentagem > 0.02)
            descontoEmPorcentagem = 0.02;
        return super.calcularDesconto(descontoEmPorcentagem);
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Alimento{" + "validade=" + validade + ", marca=" + marca + '}';
    }

}
