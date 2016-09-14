package br.aulasjava.veiculos;

public class Veiculo {
	
	//Atributos da classe
	private double combustivelMaximo;
	private int numeroMaximoPassageiros;
	private double velocidade;
	
	//M�todos construtores
	public Veiculo() {
		//Construtor vazio
	}

	public Veiculo(double combustivelMaximo, int numeroMaximoPassageiros, double velocidade) {
		super();
		this.combustivelMaximo = combustivelMaximo;
		this.numeroMaximoPassageiros = numeroMaximoPassageiros;
		this.velocidade = velocidade;
	}

	//M�todos Getters & Setters
	public double getCombustivelMaximo() {
		return combustivelMaximo;
	}

	public void setCombustivelMaximo(double combustivelMaximo) {
		this.combustivelMaximo = combustivelMaximo;
	}

	public int getNumeroMaximoPassageiros() {
		return numeroMaximoPassageiros;
	}

	public void setNumeroMaximoPassageiros(int numeroMaximoPassageiros) {
		this.numeroMaximoPassageiros = numeroMaximoPassageiros;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	//M�todos espec�ficos da classe
	public double acelerar(double taxaAceleracao, double tempoAcelaracao){
		return velocidade = velocidade + (taxaAceleracao*tempoAcelaracao);
	}
	
	public double desacelerar(double taxaAceleracao, double tempoAcelaracao){
		return velocidade = velocidade + (-taxaAceleracao * tempoAcelaracao);
	}

}
