package br.edu.iftm.atividade12;

public class Moto extends Veiculo{
    public Moto(String marca, String modelo, String ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void ligar() {
        super.setStatus(true);
        System.out.println("Moto Ligado!");
    }

    @Override
    public void desligar() {
        super.setStatus(false);
        System.out.println("Moto Desligado!");
    }
}
