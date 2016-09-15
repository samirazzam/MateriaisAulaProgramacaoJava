package br.aulasjava.empresa;

public class Administrativo extends Funcionario{

	public Administrativo() {}

	public Administrativo(String nome, double salario) {
		super(nome, salario);
		}

	public double calcularDesconto(){
		return salario*0.01;
	}
}
