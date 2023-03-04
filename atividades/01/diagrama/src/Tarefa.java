import java.util.Date;

public class Tarefa {
    private String nome;
    private Date dataIncio;
    private Date dataFim;
    private String recorrencia;
    private Categoria categoria;

    private String status;
    private Usuario usuario;

    public Tarefa() {
    }

    public Tarefa(String nome, Date dataIncio, Date dataFim, String recorrencia, Categoria categoria, String status, Usuario usuario) {
        this.nome = nome;
        this.dataIncio = dataIncio;
        this.dataFim = dataFim;
        this.recorrencia = recorrencia;
        this.categoria = categoria;
        this.status = status;
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataIncio() {
        return dataIncio;
    }

    public void setDataIncio(Date dataIncio) {
        this.dataIncio = dataIncio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getRecorrencia() {
        return recorrencia;
    }

    public void setRecorrencia(String recorrencia) {
        this.recorrencia = recorrencia;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
