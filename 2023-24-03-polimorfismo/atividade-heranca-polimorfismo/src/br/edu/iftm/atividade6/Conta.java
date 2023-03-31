package br.edu.iftm.atividade6;

public class Conta {
    private String agencia;
    private String numero;

    public Conta(String agencia, String numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public Conta() {
    }

    public void verificarConta(){
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


}
