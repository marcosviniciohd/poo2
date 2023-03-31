package br.edu.iftm.atividade5;

public class Vestuario extends Produto {
    private String tamanho;
    private String cor;
    private String marca;

    public Vestuario(String nome, double preco, String tamanho, String cor, String marca) {
        super(nome, preco);
        this.tamanho = tamanho;
        this.cor = cor;
        this.marca = marca;
    }

    public Vestuario() {
    }

    @Override
    public double calcularDesconto(double descontoEmPorcentagem) {
        System.out.println("Produto de vestuario recebe desconto limitado à 5%");
        if (descontoEmPorcentagem > 0.05)
            descontoEmPorcentagem = 0.05;
        return super.calcularDesconto(descontoEmPorcentagem);
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vestuario{" + "tamanho=" + tamanho + ", cor=" + cor + '}';
    }

}

