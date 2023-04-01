package br.edu.iftm.estudante.pkg01;

public class Aluno extends Pessoa{
    private String curso;
    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }
    @Override
    public void apresentar(){
        System.out.println("Olá, meu nome é " + getNome() + " e estudo " + curso);
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
