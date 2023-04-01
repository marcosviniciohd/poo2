package br.edu.iftm.estudante.pkg06;

public class ContaCorrent extends Conta{

    public ContaCorrent(double saldo, boolean ativo) {
        super(saldo, ativo);
    }

    @Override
    public void verificarConta(){
        if(super.isAtivo() == true){
            System.out.println("Conta Corrente Ativa");
            System.out.println("Saldo: " + super.getSaldo());
        }else{
            System.out.println("Conta Corrent Inativa");
            System.out.println("Saldo: " + super.getSaldo());
        }
    }
}
