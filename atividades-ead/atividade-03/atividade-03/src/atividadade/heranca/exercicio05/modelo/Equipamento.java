package atividadade.heranca.exercicio05.modelo;

public class Equipamento {
    private Boolean ligado;

    public Equipamento() {
        this.ligado = false;
    }
    public Equipamento(Boolean ligado) {
        this.ligado = ligado;
    }
    public void liga() {
        this.ligado = true;
    }
    public void desliga() {
        this.ligado = false;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }
}
