class Exercicio3_13_3 {
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			int resto = i % 3;
			if(resto == 0) System.out.println(i);
		}
	}
}