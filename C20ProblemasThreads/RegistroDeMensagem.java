import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class RegistroDeMensagem {

	public static void main(String[] args) throws InterruptedException {
		Collection<String> mensagens = new LinkedList<>();
		
		Thread t1 = new Thread(new ProduzMensagem(0, 1000, mensagens));
		Thread t2 = new Thread(new ProduzMensagem(1000, 2000, mensagens));
		Thread t3 = new Thread(new ProduzMensagem(2000, 3000, mensagens));

		t1.start();
		t2.start();
		t3.start();
		
		// faz com que a Thread que roda o main aguarde essa
	 	t1.join();
	 	t2.join();
	 	t3.join();
	 	
	 	System.out.println("Thread produtoras de mensagens finalizadas!");
	 	
	 	for (int i = 0; i < 1500; i++) {
			if(!mensagens.contains("Mensagem " + i))
				throw new IllegalStateException("Não encontrei a mensagem " + i);
		}
	 	
	 	if(mensagens.contains(null))
	 		throw new IllegalStateException("Não devia ter null aqui dentro");
	 	
	 	System.out.println("Fim da execução com sucesso!");
	}

}
