package br.edu.iftm.estudante.pkg01;

public class Professor extends Pessoa{
    private String formacao;

    public Professor(String nome, String formacao) {
        super(nome);
        this.formacao = formacao;
    }
    @Override
    public void apresentar(){
        System.out.println("Olá, meu nome é " + getNome() + " e leciono " + getFormacao());
    }
    public String getFormacao() {
        return formacao;
    }
    public void setFormacao(String disciplina) {
        this.formacao = disciplina;
    }
}

