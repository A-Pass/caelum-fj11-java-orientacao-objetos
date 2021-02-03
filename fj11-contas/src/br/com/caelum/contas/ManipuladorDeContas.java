package br.com.caelum.contas;

import java.util.Collections;
import java.util.List;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.contas.modelo.SaldoInsuficienteException;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	private Conta conta;

	public void criaConta(Evento evento) {
		String tipo = evento.getSelecionadoNoRadio("tipo");
		if (tipo.equals("Conta Corrente")) {
			this.conta = new ContaCorrente();
		} else if(tipo.equals("Conta Poupança")) {
			this.conta = new ContaPoupanca();
		}
		
		this.conta.setAgencia(evento.getString("agencia"));
		this.conta.setNumero(evento.getInt("numero"));
		this.conta.setTitular(evento.getString("titular"));
	}
	
	public void deposita(Evento evento) {
		this.conta.deposita(evento.getDouble("valorOperacao"));
	}
	
	public void saca(Evento evento) {
		double valor = evento.getDouble("valorOperacao");
		try {
			this.conta.saca(valor);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void transfere(Evento evento) {
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		try {
			this.conta.transfere(evento.getDouble("valorTransferencia"), destino);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void ordenaLista(Evento evento) {
		List<Conta> contas = evento.getLista("destino");
		Collections.sort(contas);
		
		// Ordem inversa
		//Collections.reverse(contas);
		
		// Embaralha elementos
		//Collections.suffle(contas);
		
		// Rotaciona Elementos
		//Collections.rotate(contas, 1);
	}
	
	public void salvaDados(Evento evento) { 
		List<Conta> contas = evento.getLista("listaContas");
		RepositorioDeContas repositorio = new RepositorioDeContas();
		repositorio.salva(contas);	
	}
	
	public List<Conta> carregaDados() {
		return new RepositorioDeContas().carrega();
	}
}
