

public class ContaCorrente implements ContaTributavel {
	protected double saldo;

	public String getTipo() {
		return "Conta Corrente";
	}
	
	@Override
	public void saca(double valor) {
		if (0 < valor && valor < this.saldo)
			this.saldo -= valor + 0.10;
	}

	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void deposita(double valor) {
		if(valor > 0)
			this.saldo += valor;
	}

	@Override
	public void atualiza(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic;
	}
}
