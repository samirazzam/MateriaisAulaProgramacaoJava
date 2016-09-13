package br.aulajava.escola;

public class AplicacaoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		Professor professor1 = new Professor();
		
		String[] entrada = {"7.0", "6.0", "5.5", "4.0"};
		aluno1.setNotas(entrada);
		
		professor1.setSalario(2000.00);
		
		System.out.println("Salário líquido = R$" +professor1.calcularSalarioLiquido());
		System.out.println("--------------------------------");
		aluno1.verificarAprovacao();
		System.out.print("Média do aluno = ");
		System.out.printf("%.2f", aluno1.calcularMedia());
	}

}
