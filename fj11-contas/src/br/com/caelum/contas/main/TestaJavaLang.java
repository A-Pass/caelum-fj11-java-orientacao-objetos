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

		// Subcapítulo 13.5 - Exercicio 1
		Object o = new Object();
		System.out.println(o);
		System.out.println(throwable);

		// Subcapítulo 13.5 - Exercíco 2
		PrintStream saida = System.out;
		saida.println("olá");

		// Subcapítulo 13.6

		String x = new String("fj11");
		String y = new String("fj11");

		if (x == y) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}

		if (x.equals(y)) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}

		// Subcapítulo 13.7 - Exercício 3
		String s = "fj11";
		s = s.replace("1", "2");
		System.out.println(s);

		// Subcapítulo 13.7 - Exercício 4
		System.out.println((s.contains("fj") ? "Contém" : "Não contém"));
		System.out.println(s.trim());
		System.out.println((s.isEmpty() ? "Vázia" : "Não vázia"));
		System.out.println(s.length());

		// Subcapítulo 13.7 - Exercício 5
		TestaJavaLang.caracterLinhaALinha(s);

		// Subcapítulo 13.7 - Exercício 6
		s = "Socorram-me, subi no ônibus em Marrocos";
		TestaJavaLang.imprimeDeTrasParaFrente(s);

		s = "anotaram a data da maratona";
		TestaJavaLang.imprimeDeTrasParaFrente(s);

		// Subcapítulo 13.7 - Exercício 7
		s = "Socorram-me, subi no ônibus em Marrocos";
		TestaJavaLang.imprimeDeTrasParaFrenteSB(s);

		s = "anotaram a data da maratona";
		TestaJavaLang.imprimeDeTrasParaFrenteSB(s);

		// Subcapítulo 13.8 - Desafio
		System.out.println(TestaJavaLang.parseInt("5682"));
	}

	/**
	 * Recebe uma string e imprime cada caracter em uma linha diferente -
	 * Subcapítulo 13.7 - Exercício 5
	 * 
	 * @param string
	 */
	private static void caracterLinhaALinha(String string) {
		int length = string.length();
		for (int i = 0; i < length; i++) {
			System.out.print(string.charAt(i));
		}

		System.out.println();

	}

	/**
	 * Recebe uma string e imprime d tras para frente. 
	 * Subcapítulo 13.7 - Exercício 6
	 * 
	 * @param string
	 */
	private static void imprimeDeTrasParaFrente(String string) {
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}

		System.out.println();

	}

	/**
	 * Recebe uma string e imprime d tras para frente 
	 * Subcapítulo 13.7 - Exercício 7
	 * 
	 * @param string
	 */
	private static void imprimeDeTrasParaFrenteSB(String string) {
		StringBuilder sb = new StringBuilder(string);

		System.out.println(sb.reverse());

	}

	/**
	 * Converte uma string numerica em inteiro
	 * Subcapítulo 13.8 - Desafio
	 * 
	 * @param string
	 * @return
	 */
	private static int parseInt(String string) {
		int n = 0;
		int pow = 1;
		int length = string.length();

		char c;
		for (int i = length - 1; i >= 0; i--) {
			if (i < length -1)
				pow *= 10;
			c = string.charAt(i);
			n += (c - '0') * pow;
		}

		return n;
	}
}
