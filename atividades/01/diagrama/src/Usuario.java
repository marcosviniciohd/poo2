import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String telefone;

    private List<Tarefa> tarefas;

    public Usuario() {
    }

    public Usuario(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.tarefas = new ArrayList<>();
    }

    public Tarefa criarTarefa(Categoria categoria, String nome, String recorrencia, Date dataInicio, Date dataFim){
        Tarefa tarefa = new Tarefa();
        tarefa.setCategoria(categoria);
        tarefa.setUsuario(this);
        tarefa.setNome(nome);
        tarefa.setRecorrencia(recorrencia);
        tarefa.setDataIncio(dataInicio);
        tarefa.setDataFim(dataFim);
        tarefa.setStatus("Ativo");
        return tarefa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
