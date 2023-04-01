package br.edu.iftm.atividade9;

public class Triangulo extends Forma{
    public Triangulo(double l) {
        super(l);
    }

    @Override
    public double calcularArea() {
        return super.getL() * super.getL() * super.getL();
    }
}
