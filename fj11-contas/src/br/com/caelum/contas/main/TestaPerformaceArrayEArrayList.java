package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformaceArrayEArrayList {

	public static void main(String[] args) {
		long inicio, fim, tempo;
		int total = 1000000; 
		int __;
		
		System.out.println("Iniciando teste Array...");
		int[] testeArray = new int[total];
		
		System.out.println("Teste de inserir elementos");
		inicio = System.currentTimeMillis();	
		for (int i = 0; i < total; i++) {
			testeArray[i] = i;
		}
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
		
		System.out.println("Teste de pegar elemento pelo índice");
		inicio = System.currentTimeMillis();	
		for (int i = 0; i < total; i++) {
			__ = testeArray[i];
		}
		fim = System.currentTimeMillis();		
		tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
		// -- 
		
		System.out.println("Iniciando teste ArrayList...");
		List<Integer> testeArrayList = new ArrayList<>();
		
		System.out.println("Teste de inserir elementos");
		inicio = System.currentTimeMillis();	
		for (int i = 0; i < total; i++) {
			testeArrayList.add(i);
		}
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
		
		System.out.println("Teste de pegar elemento pelo índice");
		inicio = System.currentTimeMillis();	
		for (int i = 0; i < total; i++) {
			__ = testeArrayList.get(i);
		}
		fim = System.currentTimeMillis();		
		tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	}

}
