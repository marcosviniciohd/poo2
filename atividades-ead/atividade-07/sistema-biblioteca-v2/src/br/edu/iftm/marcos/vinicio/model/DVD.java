package br.edu.iftm.marcos.vinicio.model;

public class DVD extends Item {
    private String genero;
    private int duracaoo;

    public DVD() {
    }

    public DVD(String titulo, String autor, Boolean disponivel, String genero, int duracaoo) {
        super(titulo, autor, disponivel);
        this.genero = genero;
        this.duracaoo = duracaoo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracaoo() {
        return duracaoo;
    }

    public void setDuracaoo(int duracaoo) {
        this.duracaoo = duracaoo;
    }
}
