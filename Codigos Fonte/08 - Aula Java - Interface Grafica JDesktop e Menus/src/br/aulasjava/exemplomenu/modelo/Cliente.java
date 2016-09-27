package br.aulasjava.exemplomenu.modelo;

public class Cliente {
	
	//Atributos da classe
	private String nome;
	private String cpf;
	private String telefone;
	private int anoNascimento;
	
	//Construtores
	
	public Cliente(){}
	
	public Cliente(String nome, String cpf, String telefone, int anoNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.anoNascimento = anoNascimento;
	}

	//Getters & Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
}
