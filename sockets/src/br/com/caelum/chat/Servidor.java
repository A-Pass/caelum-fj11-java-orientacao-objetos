package br.com.caelum.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public final class Servidor {	
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta!");

		while(true) {
			new Thread(new ManipuladorDeCliente(servidor.accept())).start();
		}		
	}
}
