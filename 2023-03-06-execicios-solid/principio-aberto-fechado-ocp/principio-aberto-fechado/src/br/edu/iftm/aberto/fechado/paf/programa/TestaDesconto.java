package br.edu.iftm.aberto.fechado.paf.programa;

import br.edu.iftm.aberto.fechado.paf.model.Desconto;
import br.edu.iftm.aberto.fechado.paf.model.DescontoFixo;
import br.edu.iftm.aberto.fechado.paf.model.DescontoPercentual;
import br.edu.iftm.aberto.fechado.paf.model.Produto;

public class TestaDesconto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Coca-Cola");
        produto.setPreco(10.0);

        Desconto desconto = new DescontoFixo();
        System.out.println(desconto.calcularDesconto(produto));

        desconto = new DescontoPercentual();
        System.out.println(desconto.calcularDesconto(produto));
    }
}
