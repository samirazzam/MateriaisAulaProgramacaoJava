package br.aulasjava.zoologico;

public abstract class Mamiferos extends Animal{
	
	private int gladulaMamaria;

	public int getGladulaMamaria() {
		return gladulaMamaria;
	}

	public void setGladulaMamaria(int gladulaMamaria) {
		this.gladulaMamaria = gladulaMamaria;
	}
	
	public void amamentar(){
		System.out.println("O " +getNome() +" está amamentando");
	}
}
