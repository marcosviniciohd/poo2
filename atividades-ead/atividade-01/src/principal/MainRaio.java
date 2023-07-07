package principal;

import math.Circulo;

public class MainRaio {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(32);
        Circulo circulo1 = new Circulo(44);
        Circulo circulo2 = new Circulo(17);
        System.out.println(circulo.calcularArea());
        System.out.println(circulo1.calcularArea());
        System.out.println(circulo2.calcularArea());
        System.out.println(circulo.calcularPerimetro());
        System.out.println(circulo1.calcularPerimetro());
        System.out.println(circulo2.calcularPerimetro());
    }
}
