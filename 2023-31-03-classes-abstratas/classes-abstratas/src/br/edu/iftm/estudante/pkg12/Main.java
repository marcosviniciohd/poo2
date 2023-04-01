package br.edu.iftm.estudante.pkg12;

public class Main {
    public static void main(String[] args){
        Moto moto = new Moto("honda","cb300", "2014");
        Carro carro = new Carro("Volkswagen","Gol", "2014");

        Garagem garagem = new Garagem();
        garagem.estacionar(moto);
        garagem.estacionar(carro);
    }
}
