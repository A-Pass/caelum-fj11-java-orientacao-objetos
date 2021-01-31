/**
 * Capítulo 14.7 - Exercício 1 - Desafio Fibonacci com Arrays
 * 
 * @author Anderson Passos Silva
 */

class C14_7Exercicio1FibonacciComArray {
	int[] posicoes;
	
	C14_7Exercicio1FibonacciComArray(int qtdMax) {
		this.posicoes = new int[qtdMax];
	}
	
	public static void main(String[] args) {
	
		int qtdMax = 20;
		
		C14_7Exercicio1FibonacciComArray fibonacci = new C14_7Exercicio1FibonacciComArray(qtdMax);
		
		for(int i = 0; i < qtdMax; i++)
			System.out.println(fibonacci.calcula(i));
	}
	
	int calcula(int posicao) {
		if(posicao == 0 || posicao == 1) {
			if(posicoes[posicao] == 0)
				posicoes[posicao] = posicao;
				
			return posicoes[posicao];
		} else {
			if(posicoes[posicao] != 0)
				return posicoes[posicao];
			else {
				return posicoes[posicao] = calcula(posicao - 2) + calcula(posicao - 1);
			}
			
		}
		
		
	}
	
}
