import java.util.Collection;

public class ProduzMensagem implements Runnable {
	private int comeco;
	private int fim;
	private Collection<String> mensagens;
	
	public ProduzMensagem(int comeco, int fim, Collection<String> mensagem) {
		super();
		this.comeco = comeco;
		this.fim = fim;
		this.mensagens = mensagem;
	}

	@Override
	public void run() {
		for (int i = comeco; i < fim; i++) {
			//synchronized(mensagens) {
				this.mensagens.add("Mensagem " + i);
			//}
		}
	}

}
