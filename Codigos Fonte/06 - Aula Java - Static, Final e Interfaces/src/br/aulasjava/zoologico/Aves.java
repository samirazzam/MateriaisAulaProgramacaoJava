package br.aulasjava.zoologico;

public abstract class Aves extends Animal{

	private double tamanhoAsa;

	public double getTamanhoAsa() {
		return tamanhoAsa;
	}

	public void setTamanhoAsa(double tamanhoAsa) {
		this.tamanhoAsa = tamanhoAsa;
	}
	
	public void chocarOvo(){
		System.out.println("Chocando o ovo.");
	}
}
