class C3_13Exercicio4 {
	public static void main(String[] args) {
		int fatorial = 1;
		for(int n = 1; n <= 10; n++) {
			fatorial = n * fatorial;
			System.out.println("Fatorial de " + n + " = " + fatorial);
		}
	}
}