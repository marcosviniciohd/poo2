package br.edu.iftm.atividade9;

public class Circulo extends Forma{
    public Circulo(double l) {
        super(l);
    }

    @Override
    public double calcularArea() {
        return Math.PI * (super.getL() * super.getL());
    }
}
