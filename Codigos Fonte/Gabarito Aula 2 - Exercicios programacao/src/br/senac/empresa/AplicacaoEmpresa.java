package br.senac.empresa;

public class AplicacaoEmpresa {

	public static void main(String[] args) {
		
		Empregado novoEmpregado = new Empregado("Marcos", "2015001A", 1000.00);
		
		System.out.print("Funcionário: " +novoEmpregado.nome 
				+"\n" +"Matrícula: " +novoEmpregado.matricula
				+"\n" +"Salário anual R$");
		System.out.printf("%.2f", novoEmpregado.salarioAnual());
		System.out.println();
		System.out.println("---------------------------");
		
		//Aumentando o salário em 10%
		novoEmpregado.aumentarSalario(10);
		System.out.print("Novo salário do funcionário " +novoEmpregado.nome
				+" R$");
		System.out.printf("%.2f", novoEmpregado.salario);
		System.out.println();
		System.out.println("----------------------------");
		
		System.out.print("Funcionário: " +novoEmpregado.nome 
				+"\n" +"Matrícula: " +novoEmpregado.matricula
				+"\n" +"Salário anual R$");
		System.out.printf("%.2f", novoEmpregado.salarioAnual());
		System.out.println();
		System.out.println("----------------------------");
		
	}//fim do main
}//fim da classe
