package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaLista {

	public static void main(String[] args) {

		List<Conta> contas = new LinkedList<Conta>();
		
		for(int i = 0; i<  10; i++) {
			Conta conta = new ContaCorrente();
			conta.setTitular("Tituolar " + i);
			Random rm = new Random();
			
			conta.deposita(rm.nextInt(10000));
			
			contas.add(conta);
		}
		
		System.out.println(contas);
		
		for (Conta conta : contas) {
			System.out.println("Titula: " + conta.getTipo());
			System.out.println("Saldo: " + conta.getSaldo());
		}

	}

}
