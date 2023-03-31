package br.edu.iftm.atividade6;

public class PrincipalConta {
    public static void main(String[] args) {
        Conta conta = new Conta("1234", "123456");
        conta.verificarConta();
        System.out.println("===================================");
        ContaCorrente contaCorrente = new ContaCorrente("1234", "123456", 1000);
        contaCorrente.verificarConta();
        System.out.println("===================================");
        ContaPoupanca contaPoupanca = new ContaPoupanca("1234", "123456", 0.5);
        contaPoupanca.verificarConta();

    }
}
