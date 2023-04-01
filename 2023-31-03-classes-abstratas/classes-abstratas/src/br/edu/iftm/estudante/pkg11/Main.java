package br.edu.iftm.estudante.pkg11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente((double) 500.01);
        ContaPoupanca cp = new ContaPoupanca((double) 500.02);
        ContaEspecial ce = new ContaEspecial((double) 500.03, 100);

        cc.sacar(100);
        cc.sacar(600);

        cp.sacar(100);
        cp.sacar(600);

        ce.sacar(600);

        List<Conta> list = new ArrayList<>();
        list.add(cc);
        list.add(cp);
        list.add(ce);

        Banco banco = new Banco();
        banco.pagarJuros(list, 1.05);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
        System.out.println(ce.getSaldo());

    }
}
