package br.aulasjava.nutricao;

public class Nutricionista extends Pessoa {

	//Atributos
	private String crn;
	
	//Construtores
	public Nutricionista(){}
	
	public Nutricionista(String nome, String cpf, String telefone, String crn) {
		super(nome, cpf, telefone);
		this.crn = crn;
	}

	//Getters & Setters
	public String getCrn() {
		return crn;
	}

	public void setCrn(String crn) {
		this.crn = crn;
	}
}
