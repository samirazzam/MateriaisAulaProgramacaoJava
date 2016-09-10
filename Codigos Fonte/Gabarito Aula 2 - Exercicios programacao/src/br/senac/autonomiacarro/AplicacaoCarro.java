/*Esse � um exemplo de aplica��o simples para teste*/

package br.senac.autonomiacarro;

import javax.swing.JOptionPane;

public class AplicacaoCarro {

	public static void main(String[] args) {
		
		Carro novoCarro = new Carro();
		
		novoCarro.modelo = "Novo Uno";
		novoCarro.capacidadeTanque = 40.0;
		novoCarro.consumoLitro = 12.0;
		
		//Usando o m�todo para saber autonomia do carro;
		System.out.println("Autonomia do " +novoCarro.modelo +" = " +novoCarro.autonomiaCarro());
		
		//Usando o m�todo para saber quantidade de tanques numa viagem
		String entradaDados = JOptionPane.showInputDialog("Qual a dist�ncia da viagem?");
		double distancia = Double.parseDouble(entradaDados);
		System.out.println("Ser�o necess�rios " +novoCarro.consumoTanque(distancia) 
				+" tanques numa viagem de " +entradaDados +"km");
	}
}
