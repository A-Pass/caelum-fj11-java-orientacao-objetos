package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformaceAdicionarNaPrimeiraPosicao {

	public static void main(String[] args) {
		
		long inicio, fim, tempo;
		int total = 30000; 
		
		
		System.out.println("Iniciando teste ArrayList...");
		List<Integer> testeArrayList = new ArrayList<>();
		
		System.out.println("Teste de inserir elemento na primeira posição");
		inicio = System.currentTimeMillis();	
		for (int i = 0; i < total; i++) {
			testeArrayList.add(0, i);
		}
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
		
		System.out.println("Teste de pegar elemento pelo índice");
		inicio = System.currentTimeMillis();	
		for (int i = 0; i < total; i++) {
			testeArrayList.get(i);
		}
		fim = System.currentTimeMillis();		
		tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
		// -- 
		
		System.out.println("Iniciando teste LinkedList...");
		List<Integer> testeLinkedList = new LinkedList<>();
		
		System.out.println("Teste de inserir elemento na primeira posição");
		inicio = System.currentTimeMillis();	
		for (int i = 0; i < total; i++) {
			testeLinkedList.add(0, i);
		}
		fim = System.currentTimeMillis();		
		tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
		
		System.out.println("Teste de pegar elemento pelo índice");
		inicio = System.currentTimeMillis();	
		for (int i = 0; i < total; i++) {
			testeLinkedList.get(i);
		}
		fim = System.currentTimeMillis();		
		tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	}

}
