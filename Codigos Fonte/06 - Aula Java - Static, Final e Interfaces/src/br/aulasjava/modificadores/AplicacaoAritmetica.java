package br.aulasjava.modificadores;

public class AplicacaoAritmetica {

	public static void main(String[] args) {
		
		double soma, sub, mult,div,exp;
		
		soma = Aritmetica.soma(89, 1);
		sub = Aritmetica.subtracao(35, 12);
		mult = Aritmetica.multiplicacao(5, 21);
		div = Aritmetica.divisao(56, 3);
		exp = Aritmetica.exponenciacao(2, 4);
		
		System.out.println("Resultado da soma de 89 e 1 = " +soma);
		System.out.println("Resultado da subtração de 35 e 12 = " +sub);
		System.out.println("Resultado da multiplicação de 5 e 21 = " +mult);
		System.out.println("Resultado da divisão de 56 e 3 = " +String.format("%.2f", div));
		System.out.println("Resultado da exponenciação de 2 elevado a 4 = " +exp);
	}
}
