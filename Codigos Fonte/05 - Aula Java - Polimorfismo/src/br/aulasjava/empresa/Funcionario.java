package br.aulasjava.empresa;

public abstract class Funcionario {
	
	private String nome;
	protected double salario;
	
	public Funcionario() {}

	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/*public double calcularDesconto(){
		return salario*0.03;
	}*/
	public abstract double calcularDesconto();
}
