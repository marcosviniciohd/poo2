package br.edu.iftm.estudante.pkg06;

public class Poupanca extends Conta{
    public Poupanca(double saldo, boolean ativo) {
        super(saldo, ativo);
    }

    @Override
    public void verificarConta(){
        if(super.isAtivo() == true){
            System.out.println("Conta Poupança Ativa");
            System.out.println("Saldo: " + super.getSaldo());
        }else{
            System.out.println("Conta Poupança Inativa");
            System.out.println("Saldo: " + super.getSaldo());
        }
    }
}
