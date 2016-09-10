/*Esse é um exemplo mais sofisticado, simulando um menu simples*/

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
		
		//Variáveis para controle da interação do programa com o usuário
		int resp = 0; //Variável para controle da repetição do programa
		String opcao;//Variável para controle da decisão da escolha de opção
		
		//Loop para controlar se o usuário deseja continuar usando o programa
		while (resp == 0){
			opcao = JOptionPane.showInputDialog("Digite 1 para saber a autonomia do carro \n"
					+"Digite 2 para entrar com uma distância e saber a quantidade de tanques necessários");
			//Usando o comando switch em vez do if/else
			switch (opcao) {
			case "1":
				JOptionPane.showMessageDialog(null,"A autonomia do carro é: " +novoCarro.autonomiaCarro() +"km");
				break;
			case "2":
				//Pegando o valor e convertendo de String para Double numa linha só
				double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância da viagem"));
				//Formatando para duas casas decimais na saída do resultado via classe DecimalFormat
				DecimalFormat formatacaoNumero  = new DecimalFormat("#.##");
				String tanques =  formatacaoNumero.format(novoCarro.consumoTanque(distancia));
				JOptionPane.showMessageDialog(null, "Serão necessários " +tanques +" tanques de combustível");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!", "Atenção", JOptionPane.WARNING_MESSAGE);
				break;
			}
			//Capturando a resposta do usuário caso queira continuar com o programa
			//Aqui segue uma variação do JOptionPane com botões de Yes ou No
			//A resposta Yes tem valor o inteiro 0 e a resposta No tem valor o inteiro 1
			resp = JOptionPane.showConfirmDialog(null, "Deseja tentar continuar?", "Programa Combustível", JOptionPane.YES_NO_OPTION);
		}
	}//fim do main
}//fim da classe
