package br.edu.iftm.estudante.pkg10;

public class Gato extends Mamifero{
    public Gato() {

    }

    @Override
    public void comer() {
        System.out.println("Gato come!");
    }

    @Override
    public void dormir() {
        System.out.println("Gato dorme!");
    }

    @Override
    public void amamentar() {
        System.out.println("Gato amamenta!");
    }
}
