package br.aulasjava.empresa;

public class Vendedor extends Funcionario{

	
	public Vendedor() {}

	public Vendedor(String nome, double salario) {
		super(nome, salario);
		}

	public double calcularDesconto(){
		return salario*0.05;
	}
}
