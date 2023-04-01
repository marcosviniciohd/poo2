package br.edu.iftm.estudante.pkg09;

public abstract class Forma {
    private double l;

    public Forma(double l) {
        this.l = l;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double calcularArea(){
        return this.l;
    }


}
