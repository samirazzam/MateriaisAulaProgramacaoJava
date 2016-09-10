package br.senac.empresa;

public class Empregado {

	//Atributos da classe
	String nome;
	String matricula;
	double salario;
	
	//Método Construtor
	public Empregado(String nomeEmp, String matriculaEmp, double salarioEmp) {
		nome = nomeEmp;
		matricula = matriculaEmp;
		salario = salarioEmp;
	}
	
	//Métodos da classe
	public double salarioAnual(){
		return salario *12;
	}
	
	public void aumentarSalario(double percentualAumento){
		salario = salario + (salario * percentualAumento)/100;
	}
}
