
public class Porta {
	private boolean aberta;
	
	void abre() {
		this.aberta = true;
	}
	
	void fecha() {
		this.aberta = false;
	}
	
	boolean estaAberta() {
		return this.aberta;
	}
}
