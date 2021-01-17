package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	private Conta conta;

	public void criaConta(Evento evento) {
		this.conta = new Conta();
		this.conta.setAgencia("1234");
		this.conta.setNumero(56789);
		this.conta.setTitular("Batman");
	}
	
	public void deposita(Evento evento) {
		this.conta.deposita(evento.getDouble("valor"));
	}
	
	public void saca(Evento evento) {
		this.conta.saca(evento.getDouble("valor"));
	}
}
