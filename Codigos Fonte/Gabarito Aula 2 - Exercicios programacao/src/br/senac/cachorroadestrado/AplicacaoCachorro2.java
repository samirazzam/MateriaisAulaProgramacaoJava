/*Esse � um exemplo mais sofisticado, simulando um menu simples*/

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

		//Vari�veis para controlar o menu de op��es
		int resp = 0; //Vari�vel para controlar a repeti��o do programa
		String opcao = ""; //Vari�vel para controlar a escolha da op��o
		//Loop para sempre perguntar ao usu�rio se deseja continuar a executar o programa
		while(resp == 0){
			opcao = JOptionPane.showInputDialog("Digite 1 para o c�o latir." +"\n"
					+"Digite 2 para o c�o sentar.");
			//Sequ�ncia de if/else para controlar a op��o de a��o escolhida para o cachorro
			if (opcao.equals("1")){
				novoCao.latir();
			}else{
				if (opcao.equals("2")){
					novoCao.sentar();
				}else{
					JOptionPane.showMessageDialog(null, "Op��o inv�lida!", "Aten��o", JOptionPane.WARNING_MESSAGE);
				}
			}
			//Capturando a resposta do usu�rio se quer continuar com o programa
			//Aqui segue uma varia��o do JOptionPane com bot�es de Yes ou No
			//A resposta Yes tem valor o inteiro 0 e a resposta No tem valor o inteiro 1
			resp = JOptionPane.showConfirmDialog(null, "Deseja tentar outro comando?", "Programa Adestramento", JOptionPane.YES_NO_OPTION);
		}
		
	}//fim do main
}//fim da classe
