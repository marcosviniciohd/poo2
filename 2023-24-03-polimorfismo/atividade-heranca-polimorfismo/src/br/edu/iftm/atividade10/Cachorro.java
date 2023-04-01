package br.edu.iftm.atividade10;

public class Cachorro extends Mamifero{
    public Cachorro() {
    }

    @Override
    public void comer() {
        System.out.println("Cachorro come!");
    }

    @Override
    public void dormir() {
        System.out.println("Cachorro dorme!");
    }

    @Override
    public void amamentar() {
        System.out.println("Cachorro amamenta!");
    }
}
