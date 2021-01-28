package br.com.caelum.contas.main;

/**
 * Capítulo 14
 * 
 * @author Anderson Passos Silva
 *
 */
public class TestaSplit {

	public static void main(String[] args) {
		// Subcapítulo 14.5 - Exercicio 3
		String frase = "Socorram-me, subi no ônibus em Marrocos";
		
		System.out.println(TestaSplit.invertePorPalavra(frase));
	}

	/**
	 * Inverte a ordem das palavras de uma frase
	 * 
	 * @param string
	 * @return
	 */
	private static String invertePorPalavra(String string) {
		String[] palavras = string.split(" ");

		String novaString = "";

		for (String palavra : palavras) {
			novaString = palavra + " " + novaString;
		}

		return novaString;
	}
}
