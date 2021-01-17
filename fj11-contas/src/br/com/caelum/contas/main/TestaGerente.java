package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ControleDeBonificacoes;
import br.com.caelum.contas.modelo.Funcionario;
import br.com.caelum.contas.modelo.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("João da Silva");
		gerente.setSalario(10000.0);
		gerente.setSenha(12345);
		
		
		//Funcionario funcionario = new Funcionario();
		//funcionario.setNome("Deltrano");
		//funcionario.setSalario(1000.0);
		
		ControleDeBonificacoes cb = new ControleDeBonificacoes();
		cb.registra(gerente);
		//cb.registra(funcionario);
		
		System.out.println("Bonificação");
		System.out.println(gerente.getNome() + ": " + gerente.getBonificacao());
		//System.out.println(funcionario.getNome() + ": " + funcionario.getBonificacao());
		System.out.println("Total de Bonificações: " + cb.getTotalDeBonificacoes());
	}

}
