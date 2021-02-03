package br.com.caelum.chat;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManipuladorDeCliente implements Runnable {

	private static final List<Socket> clientes = new ArrayList<Socket>();

	private static int qtdCliente;

	private Socket cliente;
	private int numeroDoCliente;

	private String nome;

	ManipuladorDeCliente(Socket cliente) {
		ManipuladorDeCliente.clientes.add(cliente);
		ManipuladorDeCliente.qtdCliente++;

		this.cliente = cliente;
		this.numeroDoCliente = ManipuladorDeCliente.qtdCliente;

		System.out.println("Nova conexão com o cliente " + this.numeroDoCliente + " ["
				+ cliente.getInetAddress().getHostAddress() + "]");
	}

	@Override
	public void run() {
		try (PrintStream saida = new PrintStream(cliente.getOutputStream());
				Scanner entrada = new Scanner(cliente.getInputStream())) {
			saida.println("Nickname:");
			do {
				this.nome = entrada.nextLine().trim();
				if(this.nome.isBlank())
					saida.println("Nickname:");
			} while (this.nome.isBlank());
			
			saida.println("Seja bem-vindo " + this.nome);
			this.distribuiMensagem(">>>" + this.nome + " se conectou!");
			
			while (true) this.distribuiMensagem(this.nome + ": " + entrada.nextLine());
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void distribuiMensagem(String mensagem) throws IOException {
		for (Socket cliente : ManipuladorDeCliente.clientes) {
			if (cliente != this.cliente)
				new PrintStream(cliente.getOutputStream()).println(mensagem);
		}
	}
}
