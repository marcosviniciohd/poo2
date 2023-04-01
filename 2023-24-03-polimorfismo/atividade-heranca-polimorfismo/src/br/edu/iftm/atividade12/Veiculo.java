package br.edu.iftm.atividade12;

public class Veiculo {
    private String marca;
    private String modelo;
    private String ano;
    private boolean status;

    public Veiculo(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.status = false;
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

    public String getAno() {
        return ano;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void ligar(){
        this.status = true;
        System.out.println("Veiculo ligado!");
    }

    public void desligar(){
        this.status = false;
        System.out.println("Veiculo desligado!");
    }
}
