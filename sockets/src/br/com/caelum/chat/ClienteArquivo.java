package br.com.caelum.chat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.stream.Stream;

public class ClienteArquivo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		InputStream conteudo = new FileInputStream("arquivo.txt");
				
		Socket cliente = new Socket("127.0.0.1", 12345);
				
		OutputStream saida = cliente.getOutputStream();
		int b;
		while((b = conteudo.read()) != -1) {
			saida.write(b);
		}
	}
}
