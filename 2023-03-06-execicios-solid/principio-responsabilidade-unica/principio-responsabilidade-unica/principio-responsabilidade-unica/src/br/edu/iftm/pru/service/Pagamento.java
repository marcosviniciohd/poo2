package br.edu.iftm.pru.service;

public class Pagamento {
    private CarrinhoCompras carrinhoCompras;
    private Boolean pago = false;

    public Pagamento(CarrinhoCompras carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }

    public void pagar() {
        this.pago = true;
    }

    public Boolean getPago() {
        return pago;
    }

    public CarrinhoCompras getCarrinhoCompras() {
        return carrinhoCompras;
    }
}
