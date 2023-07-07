package principal;

import modelo.ContaCorrente;

import java.util.Locale;
import java.util.Scanner;

public class TestaContaCorrente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();
        System.out.print("Digite o saldo: ");
        Double saldo = sc.nextDouble();
        ContaCorrente contaCorrente = new ContaCorrente(nome, senha, saldo);
        System.out.println("Digite a senha para logar: ");
        String senhaDigitada = sc.next();
        if (senhaDigitada.equals(contaCorrente.getSenha())) {
            System.out.println("Digite o valor para crédito: ");
            Double valor = sc.nextDouble();
            contaCorrente.credito(valor, senhaDigitada);
            System.out.println("Digite o valor para débito: ");
            valor = sc.nextDouble();
            contaCorrente.debito(valor, senhaDigitada);
        } else {
            System.out.println("Senha incorreta!");
        }
        System.out.println("Nome: " + contaCorrente.getNome());
        System.out.println("Senha: " + contaCorrente.getSenha());
        System.out.println("Saldo: " + contaCorrente.getSaldo());


    }
}
