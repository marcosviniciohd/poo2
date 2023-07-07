package principal;

public class CodigoPostal {

    private String indicativo;
    private String extensao;
    private String nomeDaZona;

    public CodigoPostal(String indicativo, String extensao, String nomeDaZona) {
        this.indicativo = indicativo;
        this.extensao = extensao;
        this.nomeDaZona = nomeDaZona;
    }

    public CodigoPostal() {
        this.indicativo = "";
        this.extensao = "";
        this.nomeDaZona = "";
    }

    public void mostrar() {
        System.out.println(this.indicativo + "-" + this.extensao + " " + this.nomeDaZona);
    }

    public String getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(String indicativo) {
        if (indicativo.length() == 5) {
            this.indicativo = indicativo;
        }
    }

    public String getExtensao() {
        return extensao;
    }

    public void setExtensao(String extensao) {
        if (extensao.length() == 3) {
            this.extensao = extensao;
        }
    }

    public String getNomeDaZona() {
        return nomeDaZona;
    }

    public void setNomeDaZona(String nomeDaZona) {
        this.nomeDaZona = nomeDaZona;
    }
}
