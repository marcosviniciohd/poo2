package atividadade.heranca.exercicio04.modelo;

public class Poupanca extends Conta {
    private Integer diaRendimento;

    public Poupanca() {
        super();
        this.diaRendimento = 0;
    }
    public Poupanca(Double saldo, Integer diaRendimento) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo não pode ser negativo");
        } else {
            super.setSaldo(saldo);
        }
        this.diaRendimento = diaRendimento;
    }

    public Integer getDiaRendimento() {
        return this.diaRendimento;
    }
    public void setDiaRendimento(Integer diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public void setSaldo(Double saldo) {
        if (saldo < 0) throw new IllegalArgumentException("Saldo não pode ser negativo");
        super.setSaldo(saldo);
    }

    @Override
    public void sacar(Double valor) {
        if (valor > super.getSaldo()) {
            System.out.println("Saldo insuficiente");
            System.out.println("Saldo atual: " + super.getSaldo());
        } else {
            super.setSaldo(super.getSaldo() - valor);
        }
    }
}
