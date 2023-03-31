package br.edu.iftm.atividade5;

public class Eletronico extends Produto {
    private String voltagem;
    private String garantia;

    public Eletronico(String nome, double preco, String voltagem, String garantia) {
        super(nome, preco);
        this.voltagem = voltagem;
        this.garantia = garantia;
    }

    public Eletronico() {
    }

    @Override
    public double calcularDesconto(double descontoEmPorcentagem) {
        System.out.println("Produto eletronico recebe desconto limitado à 10%");
        if (descontoEmPorcentagem > 0.1)
            descontoEmPorcentagem = 0.1;
        return super.calcularDesconto(descontoEmPorcentagem);
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "Eletronico{" + "voltagem=" + voltagem + ", garantia=" + garantia + '}';
    }
}
