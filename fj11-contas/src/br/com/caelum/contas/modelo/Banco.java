package br.com.caelum.contas.modelo;

import java.util.Iterator;

public class Banco {

	private String nome;
	private int numero;
	private Conta[] contas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new Conta[10];
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public void adiciona(Conta conta) {
		if(contas[contas.length - 1] != null)
			throw new RuntimeException("Array de contas cheio!");
			
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] == null) {
				contas[i] = conta;
				break;
			}
		}
	}
	
	public void mostraContas() {
		for(int i = 0; i < contas.length; i++) {
			if(contas[i] != null) {
				System.out.println("Conta na posição " + i);
				//System.out.println(contas[i].recuperaDadosParaImpressao());
				System.out.println(contas[i]);
				System.out.println("----------");
			}
		}
	}
	
	public boolean contem(Conta conta) {
		for(int i=0; i < this.contas.length; i++) {
			if(conta.equals(this.contas[i])) {
				return true;
			}
		}
		
		return false;
	}
}
