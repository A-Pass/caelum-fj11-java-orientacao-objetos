package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Banco {

	private String nome;
	private int numero;
	
	private List<Conta> contas;
	private Map<String, Conta> contasPorTitular;
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ArrayList<>();
		this.contasPorTitular = new HashMap<>();
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public void adiciona(Conta conta) {
		this.contasPorTitular.put(conta.getTitular(), conta);
		this.contas.add(conta);
	}

	public Conta pega(int x) {
		return this.contas.get(x);
	}

	public int pegaQuantidadeDeContas() {
		return this.contas.size();
	}
	
	public Conta buscaPorTitular(String titular) {
		return this.contasPorTitular.get(titular);
	}
	
	public void mostraContas() {
		int total = this.contas.size();
		for (int i = 0; i < total; i++) {
			if (contas.get(i) != null) {
				System.out.println("Conta na posição " + i);
				System.out.println(contas.get(i));
				System.out.println("----------");
			}
		}
	}

	public boolean contem(Conta conta) {
		int total = this.contas.size();

		for (int i = 0; i < total; i++) {
			if (conta.equals(this.contas.get(i))) {
				return true;
			}
		}

		return false;
	}
}
