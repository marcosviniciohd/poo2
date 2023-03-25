package br.edu.iftm.atividade3;

public class Caminhao extends Veiculo {

    public Caminhao(String nome, String marca, String modelo, String cor) {
        super(nome, marca, modelo, cor);
    }

    @Override
    public void acelelar(int velocidade) {
        super.acelelar(velocidade);
        System.out.println("Acelerando Caminhão... " + velocidade + " km/h");
    }
}
