package principal;

import modelo.Aluno;

import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua nota1:");
        Double nota1 = sc.nextDouble();
        System.out.print("Digite sua nota2:");
        Double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;
        sc.close();
        Aluno aluno = new Aluno(nome, nota1, nota2);
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota1: " + aluno.getN1());
        System.out.println("Nota2: " + aluno.getN2());
        System.out.println("Média: " + media);
    }
}
