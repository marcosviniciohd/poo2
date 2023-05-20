package questao1;

public class Jaula {
    private String nome;
    private int capacidade;
    private Animal animal = new Animal();

    public Jaula() {

    }

    public Jaula(String nome, int capacidade, Animal animal) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.animal = animal;
    }

    public void alimentarAnimal(Animal animal){
        animal.comer();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
