package br.edu.iftm.aberto.fechado.paf.model;

public class DescontoPercentual extends Desconto {
    @Override
    public Double calcularDesconto(Produto produto) {
        return produto.getPreco() * 0.1;
    }
}
