package br.edu.iftm.ativdade11;

import java.util.ArrayList;
import java.util.List;

public class MainConta {
    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente((double) 500.01);
        ContaPoupanca cp = new ContaPoupanca((double) 500.02);

        cc.sacar(100);
        cp.sacar(100);

        List<Conta> list = new ArrayList<>();
        list.add(cc);
        list.add(cp);

        Banco banco = new Banco();
        banco.pagarJuros(list, 1.05);

    }
}
