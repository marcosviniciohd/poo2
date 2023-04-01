package br.edu.iftm.estudante.pkg03;

public class App {
    public static void main(String[] args){
        Caminhao caminhao = new Caminhao(0);
        caminhao.acelerar();
        System.out.println(caminhao.getVelocidade());

        Moto moto = new Moto(0);
        moto.acelerar();
        System.out.println(moto.getVelocidade());

        Carro carro = new Carro(0);
        carro.acelerar();
        System.out.println(carro.getVelocidade());
    }
}
