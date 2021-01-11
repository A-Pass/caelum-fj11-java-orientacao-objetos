// Exercício do capitulo 3.3 
class BalancoTrimestral {
	public static void main (String[] args) {
		int gastosJaneiro = 1500;
		int gastosFevereiro = 2300;
		int gastosMarco = 1700;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println(gastosTrimestre);
		
		double mediaMensal = gastosTrimestre / 3;
		
		System.out.println("Valor da média mensal: " + mediaMensal);

	}
}