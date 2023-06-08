package br.edu.iftm.aberto.fechado.paf.model;

public class DescontoFixo extends Desconto {

    @Override
    public Double calcularDesconto(Produto produto) {
        return produto.getPreco() - 1.0;
    }

}
