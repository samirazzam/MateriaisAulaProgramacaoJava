package br.aulasjava.nutricao;

public class Paciente extends Pessoa{

	//Atributos
	private int idade; //Depois resolvemos isso por data de nascimento
	private double peso;
	private double altura;
	
	//Construtores
	public Paciente(){}
	
	public Paciente(String nome, String cpf, String telefone, int idade, double peso, double altura) {
		super(nome, cpf, telefone);
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}

	//Getters & Setters
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
