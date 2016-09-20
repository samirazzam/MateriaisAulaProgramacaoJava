package br.aulasjava.zoologico;

public class Cachorro implements Domestico {
	
	public void latir(){
		System.out.println("Au Au!");
	}

	@Override
	public void brincar() {
		System.out.println("Pega a bolinha!");
		
	}
}
