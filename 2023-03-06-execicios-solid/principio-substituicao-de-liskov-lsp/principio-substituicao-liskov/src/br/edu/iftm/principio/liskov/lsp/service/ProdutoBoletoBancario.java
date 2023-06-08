package br.edu.iftm.principio.liskov.lsp.service;

import br.edu.iftm.principio.liskov.lsp.model.Produto;

public class ProdutoBoletoBancario extends Produto {
    public void formaPagamento(Produto produto) {
        System.out.println( produto.getDescricao() + " será pago com boleto bancário");
    }
}
