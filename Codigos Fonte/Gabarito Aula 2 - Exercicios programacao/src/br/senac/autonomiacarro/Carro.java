package br.senac.autonomiacarro;

public class Carro {

	//Atributos da classe
	String modelo;
	double capacidadeTanque;
	double consumoLitro;
	
	//Métodos da classe
	public double autonomiaCarro(){
		return capacidadeTanque * consumoLitro;
	}
	
	public double consumoTanque(double distancia){
		//Descobrindo quantos litros serão necessários na viagem
		double litrosViagem = distancia / consumoLitro;
		
		//Calculando quantos tanques do carro serão necessários
		double qtdTanque = litrosViagem / capacidadeTanque;
		return  qtdTanque;
	}
}
