package br.edu.iftm.atividade1;

import java.util.Date;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String cpf, String endereco, String disciplina) {
        super(nome, cpf, endereco);
        this.disciplina = disciplina;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.printf("Disciplina: %s%n", getDisciplina());
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
