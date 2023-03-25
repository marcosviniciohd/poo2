package br.edu.iftm.atividade2;

public class PrincipalAnimal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Cachorro", "Au Au");
        Animal gato = new Gato("Gato", "Miau");
        Animal vaca = new Vaca("Vaca", "Muuu");

        cachorro.emitirSom();
        gato.emitirSom();
        vaca.emitirSom();
    }
}
