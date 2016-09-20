package br.aulasjava.modificadores;

public class CalculoFormulas {
	
		
	public final double areaCirculo(double raio){
		//Constantes.PI = 3.1415;
		Constantes constante = new Constantes();
		return constante.PI*raio*raio;
	}
	
	public static double peso(double massa){
		return Constantes.GRAV*massa;
	}
}
