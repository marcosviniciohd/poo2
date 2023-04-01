package br.edu.iftm.estudante.pkg10;

public class Vaca extends Mamifero{
    public Vaca() {
    }

    @Override
    public void comer() {
        System.out.println("Vaca come!");
    }

    @Override
    public void dormir() {
        System.out.println("Vaca dorme!");
    }

    @Override
    public void amamentar() {
        System.out.println("Vaca amamenta!");
    }
}
