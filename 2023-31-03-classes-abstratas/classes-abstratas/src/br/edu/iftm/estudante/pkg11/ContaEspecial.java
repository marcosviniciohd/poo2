package br.edu.iftm.estudante.pkg11;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public double sacar(double valor) {
        if(valor <= super.getSaldo() + this.limite)
            super.setSaldo(super.getSaldo() - valor);

        return super.getSaldo();
    }
}
