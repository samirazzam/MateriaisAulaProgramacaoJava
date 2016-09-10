package br.senac.empresa;

public class AplicacaoEmpresa {

	public static void main(String[] args) {
		
		Empregado novoEmpregado = new Empregado("Marcos", "2015001A", 1000.00);
		
		System.out.print("Funcion�rio: " +novoEmpregado.nome 
				+"\n" +"Matr�cula: " +novoEmpregado.matricula
				+"\n" +"Sal�rio anual R$");
		System.out.printf("%.2f", novoEmpregado.salarioAnual());
		System.out.println();
		System.out.println("---------------------------");
		
		//Aumentando o sal�rio em 10%
		novoEmpregado.aumentarSalario(10);
		System.out.print("Novo sal�rio do funcion�rio " +novoEmpregado.nome
				+" R$");
		System.out.printf("%.2f", novoEmpregado.salario);
		System.out.println();
		System.out.println("----------------------------");
		
		System.out.print("Funcion�rio: " +novoEmpregado.nome 
				+"\n" +"Matr�cula: " +novoEmpregado.matricula
				+"\n" +"Sal�rio anual R$");
		System.out.printf("%.2f", novoEmpregado.salarioAnual());
		System.out.println();
		System.out.println("----------------------------");
		
	}//fim do main
}//fim da classe
