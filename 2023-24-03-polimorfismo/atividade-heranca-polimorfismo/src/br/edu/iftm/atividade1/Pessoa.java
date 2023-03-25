package br.edu.iftm.atividade1;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void apresentar(){
        System.out.println();
        System.out.printf("Nome: %s%n", getNome());
        System.out.printf("CPF: %s%n", getCpf());
        System.out.printf("Endereço: %s%n", getEndereco());

    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
