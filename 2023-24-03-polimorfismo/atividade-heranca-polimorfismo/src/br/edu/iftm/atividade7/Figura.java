package br.edu.iftm.atividade7;

public class Figura {
    private double altura;
    private double largura;
    private double base;
    private double area;

    public Figura(double altura, double largura, double base) {
        this.altura = altura;
        this.largura = largura;
    }

    public Figura(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Figura(double base, double altura, double largura, double area) {
        this.altura = altura;
        this.largura = largura;
        this.base = base;
        this.area = area;
    }

    public Figura() {
    }

    public double calcularArea(){
        return 0;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
