package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;

public class TesteDaConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("Anderson Passos");
		conta.deposita(100.0);
	}
}
