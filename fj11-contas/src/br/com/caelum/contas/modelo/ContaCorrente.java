package br.com.caelum.contas.modelo;

import java.security.InvalidParameterException;

public class ContaCorrente extends Conta implements Tributavel {
	@Override
	public String getTipo() {
		return "Conta Corrente";
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		if(valor < 0)
			throw new InvalidParameterException("Você tentou sacar um valor negativo!");
		
		if(valor > this.saldo)
			throw new SaldoInsuficienteException(valor);
		
		if (valor < this.saldo)
			this.saldo -= valor + 0.10;
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
}
