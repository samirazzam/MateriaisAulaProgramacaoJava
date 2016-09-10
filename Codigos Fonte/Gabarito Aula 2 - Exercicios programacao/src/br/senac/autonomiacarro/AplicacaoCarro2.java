/*Esse � um exemplo mais sofisticado, simulando um menu simples*/

package br.senac.autonomiacarro;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class AplicacaoCarro2 {

	public static void main(String[] args) {
		
		//Criando um objeto do tipo Carro
		Carro novoCarro = new Carro();
		novoCarro.modelo = "Novo Uno";
		novoCarro.capacidadeTanque = 40.0;
		novoCarro.consumoLitro = 12.0;
		
		//Vari�veis para controle da intera��o do programa com o usu�rio
		int resp = 0; //Vari�vel para controle da repeti��o do programa
		String opcao;//Vari�vel para controle da decis�o da escolha de op��o
		
		//Loop para controlar se o usu�rio deseja continuar usando o programa
		while (resp == 0){
			opcao = JOptionPane.showInputDialog("Digite 1 para saber a autonomia do carro \n"
					+"Digite 2 para entrar com uma dist�ncia e saber a quantidade de tanques necess�rios");
			//Usando o comando switch em vez do if/else
			switch (opcao) {
			case "1":
				JOptionPane.showMessageDialog(null,"A autonomia do carro �: " +novoCarro.autonomiaCarro() +"km");
				break;
			case "2":
				//Pegando o valor e convertendo de String para Double numa linha s�
				double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a dist�ncia da viagem"));
				//Formatando para duas casas decimais na sa�da do resultado via classe DecimalFormat
				DecimalFormat formatacaoNumero  = new DecimalFormat("#.##");
				String tanques =  formatacaoNumero.format(novoCarro.consumoTanque(distancia));
				JOptionPane.showMessageDialog(null, "Ser�o necess�rios " +tanques +" tanques de combust�vel");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida!", "Aten��o", JOptionPane.WARNING_MESSAGE);
				break;
			}
			//Capturando a resposta do usu�rio caso queira continuar com o programa
			//Aqui segue uma varia��o do JOptionPane com bot�es de Yes ou No
			//A resposta Yes tem valor o inteiro 0 e a resposta No tem valor o inteiro 1
			resp = JOptionPane.showConfirmDialog(null, "Deseja tentar continuar?", "Programa Combust�vel", JOptionPane.YES_NO_OPTION);
		}
	}//fim do main
}//fim da classe
