package br.edu.iftm.atividade8;

public class Servidor extends Computador {
    private String ip;
    private String nome;

    public Servidor(String tipo, String marca, String ip, String nome) {
        super(tipo, marca);
        this.ip = ip;
        this.nome = nome;
    }

    public Servidor() {
    }

    public void iniciar() {
        System.out.println("Iniciando servidor");
        System.out.printf("Tipo: %s%n", getTipo());
        System.out.printf("Marca: %s%n", getMarca());
        System.out.printf("IP: %s%n", this.ip);
        System.out.printf("Nome: %s%n", this.nome);
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
