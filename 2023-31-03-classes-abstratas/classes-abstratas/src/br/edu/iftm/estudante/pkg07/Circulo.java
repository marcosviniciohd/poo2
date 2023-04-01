package br.edu.iftm.estudante.pkg07;

public class Circulo extends Figura{
    public Circulo(double l) {
        super(l);
    }

    @Override
    public double calcularArea() {
        return Math.PI * (super.getL() * super.getL());
    }
}
