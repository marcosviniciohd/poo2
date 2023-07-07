package modelo;

public class Calculo {
    private int saldo;

    public Calculo(int saldo) {
        this.saldo = saldo;
    }

    public Calculo() {
        this.saldo = 0;
    }

    public void credito (int valor) {
        this.saldo += valor;
    }

    public void debito (int valor) {
        this.saldo -= valor;
    }


    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
