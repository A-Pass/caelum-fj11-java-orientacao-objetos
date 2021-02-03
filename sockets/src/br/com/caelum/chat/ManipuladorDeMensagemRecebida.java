package br.com.caelum.chat;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ManipuladorDeMensagemRecebida implements Runnable {
	private Socket cliente;
	
	ManipuladorDeMensagemRecebida(Socket cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public void run() {
		try(Scanner entrada = new Scanner(this.cliente.getInputStream())) {
			while(entrada.hasNextLine()) {
				System.out.println(entrada.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
