package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta {
	@Override
	public String getTipo() {
		return "Conta Corrente";
	}
	
	@Override
	public void saca(double valor) {
		if (0 < valor && valor < this.saldo)
			this.saldo -= valor + 0.10;
	}
}
