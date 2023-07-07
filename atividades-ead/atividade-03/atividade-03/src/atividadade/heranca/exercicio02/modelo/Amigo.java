package atividadade.heranca.exercicio02.modelo;

public class Amigo extends Pessoa {
    private String dataAniversario;

    public Amigo(String nome, Character sexo, Integer idade, String dataAniversario) {
        super(nome, sexo, idade);
        this.dataAniversario = dataAniversario;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }
}
