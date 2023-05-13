package entities;

import java.util.List;

public class ContaBancaria {
    private String numero;
    private Double saldo;
    private String transacao;

    public ContaBancaria() {
    }

    public ContaBancaria(String numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public ContaBancaria(String numero, Double saldo, String transacao) {
        this.numero = numero;
        this.saldo = saldo;
        this.transacao = transacao;
    }

    public void depositar(Double valor) {
        this.saldo += valor;
    }

    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    public void transferir(Double valor, ContaBancaria contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public Double exibirSaldo() {
        return this.saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTransacao() {
        return transacao;
    }

}
