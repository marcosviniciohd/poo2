package br.edu.iftm.atividade3;

public class Moto extends Veiculo {

    public Moto(String nome, String marca, String modelo, String cor) {
        super(nome, marca, modelo, cor);
    }

    @Override
    public void acelelar(int velocidade) {
        super.acelelar(velocidade);
        System.out.println("Acelerando moto... " + velocidade + " km/h");
    }
}
