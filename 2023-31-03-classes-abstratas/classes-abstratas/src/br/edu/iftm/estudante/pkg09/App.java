package br.edu.iftm.estudante.pkg09;

import java.util.ArrayList;
import java.util.List;

public abstract class App {
    public static void main(String[] args){
        Quadrado q1 = new Quadrado(5);
        Quadrado q2 = new Quadrado(2);
        Circulo c1 = new Circulo(2);
        Circulo c2 = new Circulo(5);
        Triangulo t1 = new Triangulo(1);
        Triangulo t2 = new Triangulo(4);

        List<Forma> list = new ArrayList<>();
        list.add(q1);
        list.add(q2);
        list.add(c1);
        list.add(c2);
        list.add(t1);
        list.add(t2);

        CalculadoraDeAreas calculadoraDeAreas = new CalculadoraDeAreas();
        System.out.println(calculadoraDeAreas.somaAreas(list));
    }
}
