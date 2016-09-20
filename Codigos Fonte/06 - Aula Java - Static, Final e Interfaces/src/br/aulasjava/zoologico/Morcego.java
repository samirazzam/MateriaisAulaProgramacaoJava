package br.aulasjava.zoologico;

public class Morcego extends Mamiferos implements Voavel, Selvagem{

	public void emitirSom(){
		System.out.println(".-- -.. ---. --.");
	}

	@Override
	public void voar() {
		System.out.println("Voando com asas de pele.");
	}

	@Override
	public void cacar() {
		System.out.println("Procurando vaca para chupar sangue");
		
	}
}
