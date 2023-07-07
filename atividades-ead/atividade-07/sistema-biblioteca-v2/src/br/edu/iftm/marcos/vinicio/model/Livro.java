package br.edu.iftm.marcos.vinicio.model;

import java.util.Date;

public class Livro extends Item {
    private Date publicacao;
    private int paginas;
    private String editora;

    public Livro() {
    }

    public Livro(String titulo, String autor, Boolean disponivel, Date publicacao, int paginas, String editora) {
        super(titulo, autor, disponivel);
        this.publicacao = publicacao;
        this.paginas = paginas;
        this.editora = editora;
    }

    public Date getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Date publicacao) {
        this.publicacao = publicacao;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
