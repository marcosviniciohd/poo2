package br.edu.iftm.marcos.vinicio.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private final List<Item> carrinho = new ArrayList<>();
    private String nome;
    private String email;
    private String endereco;

    public Usuario() {
    }

    public Usuario(String nome, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public void escolher(Item item) {
        carrinho.add(item);
    }

    public void devolver(Item item) {
        carrinho.remove(item);
    }

    public void limpar() {
        carrinho.clear();
    }

    public List<Item> getCarrinho() {
        return carrinho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", nome, carrinho);
    }
}
