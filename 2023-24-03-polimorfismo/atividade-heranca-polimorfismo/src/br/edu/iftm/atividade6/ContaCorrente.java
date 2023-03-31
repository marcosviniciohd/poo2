package br.edu.iftm.atividade6;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String agencia, String numero, double limite) {
        super(agencia, numero);
        this.limite = limite;
    }

    public ContaCorrente() {
    }

    @Override
    public void verificarConta(){
        super.verificarConta();
        System.out.println("Limite: " + this.limite);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
