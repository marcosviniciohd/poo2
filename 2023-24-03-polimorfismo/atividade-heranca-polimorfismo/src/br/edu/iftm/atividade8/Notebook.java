package br.edu.iftm.atividade8;

public class Notebook extends Computador {
private String modelo;
    private String cor;
    private double preco;

    public Notebook(String tipo, String marca, String modelo, String cor, double preco) {
        super(tipo, marca);
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }

    public Notebook() {
    }

    @Override
    public void iniciar() {
        System.out.println("Iniciando notebook");
        System.out.printf("Tipo: %s%n", getTipo());
        System.out.printf("Marca: %s%n", getMarca());
        System.out.printf("Modelo: %s%n", this.modelo);
        System.out.printf("Cor: %s%n", this.cor);
        System.out.printf("Preço: %.2f%n", this.preco);

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
