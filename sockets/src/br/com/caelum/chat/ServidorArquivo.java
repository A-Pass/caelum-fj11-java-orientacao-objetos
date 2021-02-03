package br.com.caelum.chat;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorArquivo {
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(12345);
		
		Socket cliente = servidor.accept();
		
		OutputStream arquivo = new FileOutputStream("recebido.txt");
		
		System.out.println("Conectado!");
		
		InputStream entrada = cliente.getInputStream();
		
		int b;
		while((b = entrada.read()) != -1) {
			arquivo.write(b);
		}
	}
}
