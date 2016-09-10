package br.senac.cachorroadestrado;

import javax.swing.JOptionPane;

public class Cachorro {

	//Atributos da classe
	String nome;
	String raca;
	String corPelo;
	double peso;
	
	//Métodos da classe
	public void sentar(){
		JOptionPane.showMessageDialog(null, "O cachorro sentou-se.");
	}
	
	public void latir(){
		JOptionPane.showMessageDialog(null, "O cachorro latiu.");
	}
}
