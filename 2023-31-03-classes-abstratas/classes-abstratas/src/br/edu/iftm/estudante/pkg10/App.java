package br.edu.iftm.estudante.pkg10;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        Cachorro cachorro = new Cachorro();
        Galinha galinha = new Galinha();
        Gato gato =  new Gato();
        Vaca vaca = new Vaca();

        List<Animal> list = new ArrayList<>();
        list.add(cachorro);
        list.add(galinha);
        list.add(gato);
        list.add(vaca);

        Fazenda fazenda = new Fazenda();
        fazenda.alimentarAnimais(list);
    }
}
