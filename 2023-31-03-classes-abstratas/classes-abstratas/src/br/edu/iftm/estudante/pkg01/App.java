package br.edu.iftm.estudante.pkg01;

public class App {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario("João", "Engenharia de Software");
        funcionario.apresentar();

        Aluno a1 = new Aluno("Maria", "Engenharia");
        a1.apresentar();

        Professor prof1 = new Professor("José", "Engenharia de Software");
        prof1.apresentar();
    }
}
