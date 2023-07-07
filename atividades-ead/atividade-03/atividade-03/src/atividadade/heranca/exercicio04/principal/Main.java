package atividadade.heranca.exercicio04.principal;

import atividadade.heranca.exercicio04.modelo.Conta;
import atividadade.heranca.exercicio04.modelo.Poupanca;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Poupanca poupanca = new Poupanca();
        conta.depositar(10000.00);
        conta.sacar(15000.00);
        poupanca.depositar(15000.00);
        poupanca.sacar(20000.00);
    }
}
