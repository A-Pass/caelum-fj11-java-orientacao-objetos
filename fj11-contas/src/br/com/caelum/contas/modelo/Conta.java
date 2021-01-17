package br.com.caelum.contas.modelo;

/**
 * Classe que define uma conta bancária
 * 
 * @author Anderson Passos
 *
 */
/**
 * @author anderson
 *
 */
public class Conta {
	private double saldo;
	private String titular;
	private int numero;
	private String agencia;

	/**
	 * Deposita um valor na conta
	 * 
	 * @param valor
	 */
	public void deposita(double valor) {
		this.saldo += valor;
	}

	/**
	 * Obtém o titular da conta
	 * 
	 * @return
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * Define o titular da conta
	 * 
	 * @param titular
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * Obtém o numero da conta
	 * 
	 * @return
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Define o número da conta
	 * 
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Obtém a agência da conta
	 * 
	 * @return
	 */
	public String getAgencia() {
		return agencia;
	}

	/**
	 * Define a agência da conta
	 * 
	 * @param agencia
	 */
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	/**
	 * Retira um valor da conta
	 * 
	 * @param valor
	 */
	public void saca(double valor) {
		if (0 < valor && valor <= this.saldo)
			this.saldo -= valor;
	}

	/**
	 * Obtém o valor do saldo da conta
	 * 
	 * @return
	 */
	public double getSaldo() {
		return this.saldo;
	}
}
