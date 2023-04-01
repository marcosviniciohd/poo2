package br.edu.iftm.atividade12;

public class Carro extends Veiculo{
    public Carro(String marca, String modelo, String ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void ligar() {
        super.setStatus(true);
        System.out.println("Carro Ligado!");
    }

    @Override
    public void desligar() {
        super.setStatus(false);
        System.out.println("Carro Desligado!");
    }
}
