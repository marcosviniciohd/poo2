package br.edu.iftm.atividade1;

public class PrincipalEscola {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Marcos Vinício", "12345678910", "Avenida Das Couves, 30");
        Aluno aluno = new Aluno("Vinícius Eduardo", "12345698710", "Rua Pinho, 250", true);
        Professor professor = new Professor("Cibele Fonceca", "25525525500", "Avenida IFTM, 255", "POO_II");
        pessoa.apresentar();
        aluno.apresentar();
        professor.apresentar();
    }
}
