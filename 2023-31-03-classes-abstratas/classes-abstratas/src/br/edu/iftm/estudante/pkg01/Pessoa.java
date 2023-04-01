package br.edu.iftm.estudante.pkg01;

public abstract class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    public void apresentar(){
        System.out.println("Olá, meu nome é " + nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
