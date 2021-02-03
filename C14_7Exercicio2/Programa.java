
public final class Programa {

	public static void main(String[] args) {
		Casa casa = new Casa();
		
		casa.pinta("Beje Café");
		
		Porta p1 = new Porta();
		casa.adicionaPorta(p1);
		p1.abre();
		
		Porta p2 = new Porta();
		casa.adicionaPorta(p2);
		p2.fecha();
		
		Porta p3 = new Porta();
		casa.adicionaPorta(p3);
		p3.abre();
		
		System.out.println("Cor da casa: " + casa.getCor());
		System.out.println("Número de portas abertas: " + casa.quatasPortasEstaoAbertas());
		System.out.println("Número total de portas: " + casa.totalDePortas());
		
		

	}

}
