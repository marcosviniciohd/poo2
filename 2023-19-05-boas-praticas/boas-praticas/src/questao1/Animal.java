package questao1;

public class Animal {
    private String nome;
    private String especie;

    public Animal() {

    }

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public void comer() {
        System.out.println( this.nome + " está comendo");
    }

    public void emitirSom() {
        if (this.especie == "Felino"){
            System.out.println("O " + getNome() + " está rogindo");
        } else if (this.especie == "Herbívoro"){
            System.out.println("O " + getNome() + " está berrando");
        } else {
            System.out.println("Emitindo som");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

}
