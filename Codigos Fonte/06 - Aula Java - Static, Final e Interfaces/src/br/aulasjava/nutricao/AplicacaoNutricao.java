package br.aulasjava.nutricao;

public class AplicacaoNutricao {
	
	public static void main(String[] args) {
		
		Paciente paciente = new Paciente("Marcos", "123456", "95585-6698", 38, 85.4, 1.71);
		
		//Posso calcular somente o MB
		System.out.println("M.B = " +FormulasNutricionais.metabolismoBasal(paciente));
		System.out.println("____________________________________________");
		
		//Posso calcular apenas o VET para atividade moderada (2)
		System.out.println("VET = " +FormulasNutricionais.valorEnergeticoTotal(paciente, 2));
		System.out.println("____________________________________________");
		
		//Ou posso acionar o resumo completo
		FormulasNutricionais.resumoNutricional(paciente, 2);
		System.out.println("____________________________________________");
	}

}
