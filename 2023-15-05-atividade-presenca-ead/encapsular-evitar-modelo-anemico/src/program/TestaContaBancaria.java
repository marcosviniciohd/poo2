package program;

import entities.ContaBancaria;

public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("123", 1000.0);
        System.out.println("Conta inicializada com " + conta.getSaldo() + " reais.");
        System.out.println("Depositando 500 reais...");
        conta.depositar(500.0);
        System.out.println("Saldo atual: " + conta.getSaldo() + " reais.");
        System.out.println("Sacando 200 reais...");
        conta.sacar(200.0);
        System.out.println("Saldo atual: " + conta.getSaldo() + " reais.");
    }
}
