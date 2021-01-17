package br.com.caelum.contas.modelo;

public class ControleDeBonificacoes {
	private double totalDeBonificacoes = 0;

	/**
	 * Registra a bonificação de um funcionário
	 * 
	 * @param funcionario
	 */
	public void registra(Funcionario funcionario) {
		System.out.println("Adicionando bonificacao do funcionário: " + funcionario);
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}

	/**
	 * Obtém o total de bonificações registradas
	 * 
	 * @return
	 */
	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
}
