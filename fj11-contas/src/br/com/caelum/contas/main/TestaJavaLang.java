package br.com.caelum.contas.main;

import java.io.PrintStream;

/**
 * Capítulo 13
 * 
 * @author Anderson Passos
 */

public class TestaJavaLang {

	public static void main(String[] args) {
		Throwable throwable = new Throwable(); 

		// Subcapítulo 3.15 - Exercicio 1
		Object o = new Object();
		System.out.println(o);
		System.out.println(throwable);
		
		// Subcapítulo 3.15 - Exercíco 2
		PrintStream saida = System.out;
		saida.println("olá");
	}

}
