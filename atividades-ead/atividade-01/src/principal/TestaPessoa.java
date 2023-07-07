package principal;

import modelo.Pessoa;

import java.util.Scanner;

public class TestaPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Digite a idade: ");
        Integer idade = sc.nextInt();
        sc.close();
        Pessoa pessoa = new Pessoa(nome, cpf, idade);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Idade: " + pessoa.getIdade());

    }
}
