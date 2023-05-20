package questao1;

import java.util.ArrayList;

public class TestaZoologico {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico("Zoo de Curitiba", new ArrayList<Jaula>());
        zoo.getJaulas().add(new Jaula("Jaula 1", 2, new Animal("Leão", "Felino")));
        zoo.getJaulas().add(new Jaula("Jaula 2", 3, new Animal("Tigre", "Felino")));
        zoo.getJaulas().add(new Jaula("Jaula 3", 4, new Animal("Girafa", "Herbívoro")));
        zoo.getJaulas().get(0).alimentarAnimal(zoo.getJaulas().get(0).getAnimal());
        zoo.getJaulas().get(1).alimentarAnimal(zoo.getJaulas().get(1).getAnimal());
        zoo.getJaulas().get(2).alimentarAnimal(zoo.getJaulas().get(2).getAnimal());
        zoo.getJaulas().get(0).getAnimal().emitirSom();
        zoo.getJaulas().get(1).getAnimal().emitirSom();
        zoo.getJaulas().get(2).getAnimal().emitirSom();
    }
}
