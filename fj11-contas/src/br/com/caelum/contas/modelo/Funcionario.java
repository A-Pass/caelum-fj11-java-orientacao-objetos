package br.com.caelum.contas.modelo;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonificacao() {
		return this.salario * 0.10;
	}
}
