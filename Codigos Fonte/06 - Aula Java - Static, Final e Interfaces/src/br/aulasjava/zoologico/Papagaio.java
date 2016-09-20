package br.aulasjava.zoologico;

public class Papagaio extends Aves implements Voavel{

	public void falar(String palavra){
		System.out.println(palavra +"curupac!");
	}

	@Override
	public void voar() {
		System.out.println("Voando com penas e ossos pneumáticos");
	}
	
}
