package br.edu.iftm.atividade6;

public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(String agencia, String numero, double rendimento) {
        super(agencia, numero);
        this.rendimento = rendimento;
    }

    public ContaPoupanca() {
    }

    @Override
    public void verificarConta(){
        super.verificarConta();
        System.out.println("Rendimento: " + this.rendimento);
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}
