package br.aulasjava.modificadores;

public class Aritmetica {

	public static double soma(double num1, double num2){
		return num1+num2;
	}
	
	public static double subtracao(double num1, double num2){
		return num1-num2;
	}
	
	public static double multiplicacao(double num1, double num2){
		return num1*num2;
	}
	
	public static double divisao(double dividendo, double divisor){
		return dividendo/divisor;
	}
	
	public static double exponenciacao(double base, double expoente){
		double exp = 1;
		for(int i = 1; i<= expoente;i++){
			exp = exp*base;
		}
		return exp;
	}
}

