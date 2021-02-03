package br.com.caelum.contas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class RepositorioDeContas {
	public void salva(List<Conta> contas) {
		PrintStream stream = null;
		try {
			stream = new PrintStream("contas.txt");
			for (Conta conta : contas) {
				stream.println(conta.getTipo() + "," + conta.getNumero() + "," + conta.getAgencia() + ","
						+ conta.getTitular() + "," + conta.getSaldo());
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException();
		} finally {
			stream.close();
		}
	}

	public List<Conta> carrega() {
		List<Conta> contas = new ArrayList<Conta>();

		Scanner scanner;

		try {
			scanner = new Scanner(new FileInputStream("contas.txt"));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e.getMessage());
		}

		
		String linha;
		while (scanner.hasNextLine() &&  (linha = scanner.nextLine()) != null) {
			String[] valores = linha.split(",");
			
			Conta conta = null;

			if (valores[0].equals("Conta Corrente"))
				conta = new ContaCorrente();
			else if (valores[0].equals("Conta Poupança"))
				conta = new ContaPoupanca();
			
			if(conta != null) {
				conta.setNumero(Integer.parseInt(valores[1]));
				conta.setAgencia(valores[2]);
				conta.setTitular(valores[3]);
				conta.deposita(Double.parseDouble(valores[4]));

				contas.add(conta);
			}
		}
		scanner.close();

		return contas;
	}
}
