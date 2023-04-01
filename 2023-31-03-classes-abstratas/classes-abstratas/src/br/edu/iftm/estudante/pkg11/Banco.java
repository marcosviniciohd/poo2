package br.edu.iftm.estudante.pkg11;

import java.util.List;

public class Banco {
    public Banco() {
    }

    public void pagarJuros(List<Conta> list, double juros){
        for(Conta conta : list){
            if(conta instanceof ContaPoupanca){
                conta.setSaldo(conta.getSaldo() * juros);
            }
        }
    }

}
