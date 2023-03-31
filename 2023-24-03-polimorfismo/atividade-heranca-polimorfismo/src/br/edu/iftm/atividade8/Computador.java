package br.edu.iftm.atividade8;

public class Computador {
    private String tipo;
    private String marca;

    public Computador(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    public Computador() {
    }

    public void iniciar() {
        System.out.println("Iniciando computador");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
