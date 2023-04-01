package br.edu.iftm.ativdade11;

public class ContaCorrente extends Conta{

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double sacar(double valor) {
        if(super.getSaldo() <= valor)
            super.setSaldo(getSaldo() -  (valor * 0.01));
        return super.getSaldo();
    }
}
