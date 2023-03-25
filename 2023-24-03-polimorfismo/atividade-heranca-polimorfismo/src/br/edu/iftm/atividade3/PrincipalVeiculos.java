package br.edu.iftm.atividade3;

public class PrincipalVeiculos {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Carro", "Ford", "Fiesta", "Preto");
        Veiculo moto = new Moto("Moto", "Honda", "CG", "Vermelha");
        Veiculo caminhao = new Caminhao("Caminhão", "Mercedes", "Actros", "Branco");

        carro.imprirInfos();
        carro.acelelar(100);

        moto.imprirInfos();
        moto.acelelar(110);

        caminhao.imprirInfos();
        caminhao.acelelar(120);

    }
}
