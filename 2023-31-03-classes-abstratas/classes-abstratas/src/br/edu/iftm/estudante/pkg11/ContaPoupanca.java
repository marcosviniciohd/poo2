package br.edu.iftm.estudante.pkg11;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public double sacar(double valor) {
        if(valor <= super.getSaldo())
            super.setSaldo(super.getSaldo() - (valor * 0.02));

        return super.getSaldo();
    }
}
