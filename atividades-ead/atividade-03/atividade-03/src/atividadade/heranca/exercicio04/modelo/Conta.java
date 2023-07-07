package atividadade.heranca.exercicio04.modelo;

public class Conta {
    private Double saldo;

    public Conta() {
        this.saldo = 0.0;
    }

    public Conta(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double valor) {
        this.saldo += valor;
    }

    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
