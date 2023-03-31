package br.edu.iftm.atividade7;

public class PrincipalFigura {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();


        triangulo.setAltura(10);
        triangulo.setBase(10);
        circulo.setRaio(10);
        retangulo.setAltura(10);
        retangulo.setBase(10);

        System.out.println("Triangulo: " + triangulo.calcularArea());
        System.out.println("Circulo: " + circulo.calcularArea());
        System.out.println("Retangulo: " + retangulo.calcularArea());
    }
}
