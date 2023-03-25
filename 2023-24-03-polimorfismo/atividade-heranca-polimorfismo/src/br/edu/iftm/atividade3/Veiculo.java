package br.edu.iftm.atividade3;

public class Veiculo {
    private String nome;
    private String marca;
    private String modelo;
    private String cor;

    public Veiculo(String nome, String marca, String modelo, String cor) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public void acelelar(int velocidade) {
    }

    public void imprirInfos() {
        System.out.println("=====================================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
}
