package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

/**
 * 
 * Capítulo 14
 * 
 * @author Anderson Passos Silva
 *
 */
public class TestaBanco {

	public static void main(String[] args) {
		// Subcapítulo 14.5 - Exercício 6 
		
		Banco banco = new Banco("B. A-Pass", 1);
		
		Conta conta;
		
		for (int i = 0; i < 5; i++) {
			conta = new ContaCorrente();
			conta.setTitular("Titular " + i);
			conta.setNumero(i);
			conta.setAgencia("1000");
			conta.deposita(i * 1000 + 1000);
			banco.adiciona(conta);
		}
		
		// Subcapítulo 14.5 - Exercício 7
		banco.mostraContas();
	}

}
