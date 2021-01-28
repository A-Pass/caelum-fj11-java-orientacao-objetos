package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

/**
 * Capítulo 14
 * 
 * @author Anderson Passos Silva
 *
 */

public class TestaArrays {

	public static void main(String[] args) {
		// Subcapítulo 14.5 - Exercício 1

		Conta[] contas = new Conta[10];

		for (int i = 0; i < 10; i++) {
			contas[i] = new ContaCorrente();
			contas[i].deposita(i * 100.0);
		}

		// Subcapítulo 14.5 - Exercício 2

		double media = 0;
		for (Conta conta : contas) {
			media += conta.getSaldo() / contas.length;
		}

		System.out.println("Média: " + media);

	}

	

}
