package br.edu.iftm.principio.liskov.lsp.principal;

import br.edu.iftm.principio.liskov.lsp.model.Produto;
import br.edu.iftm.principio.liskov.lsp.service.ProdutoBoletoBancario;
import br.edu.iftm.principio.liskov.lsp.service.ProdutoCartaoCredito;
import br.edu.iftm.principio.liskov.lsp.service.ProdutoTransferenciaBancaria;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setDescricao("Notebook");
        produto.setPreco(2000.00);

        ProdutoCartaoCredito produtoCartaoCredito = new ProdutoCartaoCredito();
        produtoCartaoCredito.formaPagamento(produto);

        Produto produto1 = new Produto();
        produto1.setDescricao("Notebook Samsung");
        produto1.setPreco(4000.00);

        ProdutoTransferenciaBancaria produtoTransferenciaBancaria = new ProdutoTransferenciaBancaria();
        produtoTransferenciaBancaria.formaPagamento(produto1);

        Produto produto2 = new Produto();
        produto2.setDescricao("Notebook Lenovo Gamer");
        produto2.setPreco(5000.00);

        ProdutoBoletoBancario produtoBoletoBancario = new ProdutoBoletoBancario();
        produtoBoletoBancario.formaPagamento(produto2);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto);
        produtos.add(produto1);
        produtos.add(produto2);

        for (Produto p : produtos) {
            System.out.println(p.getDescricao() + " - " + p.getPreco());
        }

    }
}
