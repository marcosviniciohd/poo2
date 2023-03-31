package br.edu.iftm.atividade8;

public class Desktop extends Computador {
    private String modelo;
    private String cor;

    public Desktop(String tipo, String marca, String modelo, String cor) {
        super(tipo, marca);
        this.modelo = modelo;
        this.cor = cor;
    }

    public Desktop() {
    }

    public void iniciar() {
        System.out.println("Iniciando desktop");
        System.out.printf("Tipo: %s%n", getTipo());
        System.out.printf("Marca: %s%n", getMarca());
        System.out.printf("Modelo: %s%n", this.modelo);
        System.out.printf("Cor: %s%n", this.cor);

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
