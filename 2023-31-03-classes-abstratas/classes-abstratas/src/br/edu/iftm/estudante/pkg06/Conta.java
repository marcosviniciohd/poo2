package br.edu.iftm.estudante.pkg06;

public abstract class Conta {
    private double saldo;
    private boolean ativo;

    public Conta(double saldo, boolean ativo) {
        this.saldo = saldo;
        this.ativo = ativo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    public void verificarConta(){
        if(ativo == true){
            System.out.println("Conta ativa");
            System.out.println("Saldo: " + saldo);
        }else{
            System.out.println("Conta inativa");
            System.out.println("Saldo: " + saldo);
        }
    }
}
