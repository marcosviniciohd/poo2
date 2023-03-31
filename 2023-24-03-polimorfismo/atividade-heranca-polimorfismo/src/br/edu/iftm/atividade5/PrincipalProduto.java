package br.edu.iftm.atividade5;

public class PrincipalProduto {
    public static void main(String[] args) {
        Alimento alimento = new Alimento("Arroz", 10.0, "01/01/2021", "Vasconcelos");
        System.out.println("Nome: " + alimento.getNome());
        System.out.println("Preço: " + alimento.getPreco());
        System.out.println("Validade: " + alimento.getValidade());
        System.out.println("Marca: " + alimento.getMarca());
        System.out.println("Preço com desconto: " + alimento.calcularDesconto(0.3));
        System.out.println("====================================");
        Eletronico eletronico = new Eletronico("TV", 1000.0, "110V", "1 ano");
        System.out.println("Nome: " + eletronico.getNome());
        System.out.println("Preço: " + eletronico.getPreco());
        System.out.println("Voltagem: " + eletronico.getVoltagem());
        System.out.println("Garantia: " + eletronico.getGarantia());
        System.out.println("Preço com desconto: " + eletronico.calcularDesconto(0.9));
        System.out.println("====================================");
        Vestuario vestuario = new Vestuario("Camisa", 50.0, "M", "Preto", "Polo");
        System.out.println("Nome: " + vestuario.getNome());
        System.out.println("Preço: " + vestuario.getPreco());
        System.out.println("Tamanho: " + vestuario.getTamanho());
        System.out.println("Cor: " + vestuario.getCor());
        System.out.println("Marca: " + vestuario.getMarca());
        System.out.println("Preço com desconto: " + vestuario.calcularDesconto(0.5));
    }
}

