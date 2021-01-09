package br.com.caelum.contas.modelo;

/**
 * Classe respons�vel por modificar as contas do banco
 * 
 * @author Anderson Passos Silva
 */
public class Conta {
	private double saldo;

	/**
	 * M�todo que incrementa o saldo
	 * 
	 * @param valor
	 */
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
}
