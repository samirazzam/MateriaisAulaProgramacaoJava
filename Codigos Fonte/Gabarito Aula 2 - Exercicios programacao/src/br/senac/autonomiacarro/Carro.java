package br.senac.autonomiacarro;

public class Carro {

	//Atributos da classe
	String modelo;
	double capacidadeTanque;
	double consumoLitro;
	
	//M�todos da classe
	public double autonomiaCarro(){
		return capacidadeTanque * consumoLitro;
	}
	
	public double consumoTanque(double distancia){
		//Descobrindo quantos litros ser�o necess�rios na viagem
		double litrosViagem = distancia / consumoLitro;
		
		//Calculando quantos tanques do carro ser�o necess�rios
		double qtdTanque = litrosViagem / capacidadeTanque;
		return  qtdTanque;
	}
}
