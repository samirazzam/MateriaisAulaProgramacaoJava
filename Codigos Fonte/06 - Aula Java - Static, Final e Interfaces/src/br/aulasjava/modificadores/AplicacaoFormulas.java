package br.aulasjava.modificadores;

public class AplicacaoFormulas {

	public static void main(String[] args) {
		double peso, areaC;
		CalculoFormulas calc = new CalculoFormulas();
		peso = CalculoFormulas.peso(59.5);
		areaC = calc.areaCirculo(6);
		
		System.out.println("Peso do objeto = " +String.format("%.2f", peso));
		System.out.println("Area do circulo = " +String.format("%.2f", areaC));
	}
}
