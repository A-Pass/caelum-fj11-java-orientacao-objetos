class C3_13Exercicio5 {
	public static void main(String[] args) {
		long fatorial = 1;
		for(int n = 1; n <= 40; n++) {
			fatorial = n * fatorial;
			System.out.println("Fatorial de " + n + " = " + fatorial);
		}
	}
}