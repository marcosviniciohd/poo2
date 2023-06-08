package br.edu.iftm.principio.liskov.lsp.model;

public class Produto {
    private String descricao;
    private Double preco;

    public String getDescricao() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
