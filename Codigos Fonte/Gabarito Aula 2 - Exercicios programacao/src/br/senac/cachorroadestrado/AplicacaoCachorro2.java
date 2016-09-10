/*Esse é um exemplo mais sofisticado, simulando um menu simples*/

package br.senac.cachorroadestrado;

import javax.swing.JOptionPane;

public class AplicacaoCachorro2 {
	public static void main(String[] args) {

		//Criando um novo objeto do tipo Cachorro
		Cachorro novoCao = new Cachorro();

		//Inicializando o valor dos atributos
		novoCao.nome = "Bidu";
		novoCao.raca = "Schnauzer";
		novoCao.corPelo = "Azul";
		novoCao.peso = 6.5;

		//Variáveis para controlar o menu de opções
		int resp = 0; //Variável para controlar a repetição do programa
		String opcao = ""; //Variável para controlar a escolha da opção
		//Loop para sempre perguntar ao usuário se deseja continuar a executar o programa
		while(resp == 0){
			opcao = JOptionPane.showInputDialog("Digite 1 para o cão latir." +"\n"
					+"Digite 2 para o cão sentar.");
			//Sequência de if/else para controlar a opção de ação escolhida para o cachorro
			if (opcao.equals("1")){
				novoCao.latir();
			}else{
				if (opcao.equals("2")){
					novoCao.sentar();
				}else{
					JOptionPane.showMessageDialog(null, "Opção inválida!", "Atenção", JOptionPane.WARNING_MESSAGE);
				}
			}
			//Capturando a resposta do usuário se quer continuar com o programa
			//Aqui segue uma variação do JOptionPane com botões de Yes ou No
			//A resposta Yes tem valor o inteiro 0 e a resposta No tem valor o inteiro 1
			resp = JOptionPane.showConfirmDialog(null, "Deseja tentar outro comando?", "Programa Adestramento", JOptionPane.YES_NO_OPTION);
		}
		
	}//fim do main
}//fim da classe
