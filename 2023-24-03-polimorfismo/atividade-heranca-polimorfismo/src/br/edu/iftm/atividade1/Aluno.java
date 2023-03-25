package br.edu.iftm.atividade1;

import java.util.Date;

public class Aluno extends Pessoa {
    private Boolean matriculado;

    public Aluno(String nome, String cpf, String endereco, Boolean matriculado) {
        super(nome, cpf, endereco);
        this.matriculado = matriculado;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.printf("Matriculado: %b%n", getMatriculado());
    }

    public Boolean getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(Boolean matriculado) {
        this.matriculado = matriculado;
    }
}
