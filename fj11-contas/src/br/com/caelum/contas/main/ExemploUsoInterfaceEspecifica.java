package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class ExemploUsoInterfaceEspecifica {

	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<>();

		contas.add(new ContaCorrente());
		
		// Collection não possui o método get
		contas.get(0);
		
	}

}
