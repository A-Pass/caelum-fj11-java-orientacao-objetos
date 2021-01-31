package br.com.caelum.contas.modelo;

import java.security.InvalidParameterException;

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
public abstract class Conta {
	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;

	/**
	 * Deposita um valor na conta
	 * 
	 * @param valor
	 */
	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo!");
		}
		this.saldo += valor;
	}

	/**
	 * Obtém o titular da conta
	 * 
	 * @return
	 */
	public String getTitular() {
		return this.titular;
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
		return this.numero;
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
		return this.agencia;
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
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if (valor < 0)
			throw new InvalidParameterException("Você tentou sacar um valor negativo!");

		if (this.saldo < valor)
			throw new SaldoInsuficienteException(valor);

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

	/**
	 * Obtém o tipo da conta
	 * 
	 * @return
	 */
	public abstract String getTipo();

	/**
	 * Transfere um valar para outra conta
	 * 
	 * @param valor
	 * @param conta
	 * @throws SaldoInsuficienteException
	 */
	public void transfere(double valor, Conta conta) throws SaldoInsuficienteException {
		this.saca(valor);
		conta.deposita(valor);
	}

	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.getTitular();
		dados += "\nNúmero: " + this.getNumero();
		dados += "\nAgência " + this.getAgencia();
		dados += "\nSaldo: R$ " + this.getSaldo();
		dados += "\nTipo: " + this.getTipo();
		return dados;
	}

	@Override
	public String toString() {
		return "[Titular: " + this.titular.toUpperCase() + ", Número: " + this.numero + ", Agência: " + this.agencia + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		Conta conta = (Conta) obj;

		return conta.numero == this.numero && conta.agencia.equals(this.agencia);
	}
}
