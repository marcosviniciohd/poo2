package br.edu.iftm.sistema.biblioteca.model;

public class Revista extends Item {
    private int edicao;
    private String editora;

    public Revista() {
    }

    public Revista(String titulo, String autor, Boolean disponivel, int edicao, String editora) {
        super(titulo, autor, disponivel);
        this.edicao = edicao;
        this.editora = editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
