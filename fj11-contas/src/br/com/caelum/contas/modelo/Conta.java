package br.com.caelum.contas.modelo;

/**
 * Classe responsável por modificar as contas do banco
 * 
 * @author Anderson Passos Silva
 */
public class Conta {
	private double saldo;

	/**
	 * Método que incrementa o saldo
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
