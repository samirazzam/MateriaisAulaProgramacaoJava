package br.aulajava.escola;

import javax.swing.JOptionPane;

public class AplicacaoTeste2 {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		Professor professor1 = new Professor();
		
		aluno1.setNome("Sandro");
		aluno1.setEndereco("Rua ABC");
		aluno1.setCpf("123456");
		aluno1.setCurso("Programação Java");
		//String [] notas = {"8.3","7.5"};
		String [] notas = new String[4];
		for(int i = 0; i < notas.length; i++){
			notas[i] = JOptionPane.showInputDialog("Digite a nota " +(i+1));
		}
		
		aluno1.setNotas(notas);
		
		professor1.setNome("Aurelio");
		professor1.setEndereco("Rua DEF");
		professor1.setCpf("078456");
		professor1.setDepto("Computação");
		professor1.setSalario(2500.00);
		
		System.out.println(aluno1.exibeDados());
		aluno1.verificarAprovacao();
		System.out.println("------------------------");
		System.out.println(professor1.exibeDados());
	}
}
