package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.SaldoInsuficienteException;

public class TestaException {

	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		
		c.deposita(100);
		
		 try {
			 c.saca(200);
			 System.out.println("Passou!");
		 } catch (SaldoInsuficienteException e) {
			 System.out.println(e.getMessage());
		 }
	}

}
