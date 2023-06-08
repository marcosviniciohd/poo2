package br.edu.iftm.pru.service;

public class ConfirmacaoEmail {
    private Pagamento pagamento;

    public ConfirmacaoEmail(Pagamento pagamento) {
        if(pagamento.getPago()) {
            System.out.println("Email de confirmação enviado para o cliente.");
        } else {
            System.out.println("Favor realizar o pagamento!.");
        }
    }
}
