package br.com.caelum.contas.main;

import java.util.HashSet;
import java.util.Set;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaHashCode {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		c1.setTitular("Titular 1");
		c1.setNumero(1);
		c1.setAgencia("1");
		
		Conta c2 = new ContaCorrente();
		c2.setTitular("Titular 2");
		c2.setNumero(1);
		c2.setAgencia("1");
		
		Set<Conta> contas = new HashSet<>();
		
		boolean teste;
		
		teste = contas.add(c1);
		System.out.println(teste ? "Sim" : "Não");
		
		teste = contas.add(c2);
		System.out.println(teste ? "Sim" : "Não");
		
	}

}
