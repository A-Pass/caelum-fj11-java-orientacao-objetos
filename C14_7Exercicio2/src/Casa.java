
public class Casa {
	private String cor;
	private int totalDePortas;
	private Porta[] portas = new Porta[10];

	public String getCor() {
		return this.cor;
	}
	
	void pinta(String cor) {
		this.cor = cor;
	}
	
	int quatasPortasEstaoAbertas () {
		int qtdPortasAbertas = 0;
		
		for(Porta porta: this.portas) {
			if(porta == null) break;
			if(porta.estaAberta())
				qtdPortasAbertas++;
		}
		return qtdPortasAbertas;
	}
	
	void adicionaPorta(Porta porta) {
		if(this.portas[this.portas.length - 1] != null) {
			Porta[] portas = new Porta[this.portas.length + 10];
			for (int i = 0; i < this.portas.length; i++) {
				portas[i] = this.portas[i];
			}
			portas[this.portas.length] = porta;
		} else {
		
			for(int i = 0; i < this.portas.length; i++) {
				if(this.portas[i] == null) {
					this.portas[i] = porta;
					break;
				}
			}
		}
	}
	
	int totalDePortas() {
		int total = 0;
		for (int i = 0; i < portas.length; i++) {
			if(this.portas[i] != null) total++;
			else break;
		}
		return total;
	}
}
