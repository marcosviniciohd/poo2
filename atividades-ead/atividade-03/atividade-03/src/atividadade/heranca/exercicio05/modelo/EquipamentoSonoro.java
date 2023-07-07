package atividadade.heranca.exercicio05.modelo;

public class EquipamentoSonoro extends Equipamento {
    private Integer volume;
    private Boolean stereo;

    public EquipamentoSonoro() {
        super();
        this.volume = 0;
        this.stereo = false;
    }
    public EquipamentoSonoro(Boolean ligado, Integer volume, Boolean stereo) {
        super(ligado);
        this.volume = volume;
        this.stereo = stereo;
    }
    public void mono() {
        this.stereo = false;
    }
    public void stereo() {
        this.stereo = true;
    }

    @Override
    public void liga() {
        super.liga();
        this.volume = 5;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Boolean getStereo() {
        return stereo;
    }

    public void setStereo(Boolean stereo) {
        this.stereo = stereo;
    }
}
