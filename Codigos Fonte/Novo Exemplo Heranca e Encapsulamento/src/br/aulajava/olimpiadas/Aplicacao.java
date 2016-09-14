package br.aulajava.olimpiadas;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		//Criando objetos do tipo AtletaFutebol e AtletaJudo
		AtletaFutebol jogador = new AtletaFutebol();
		AtletaJudo lutador = new AtletaJudo();
		
		//Carregando os dados nos atributos das classes
		jogador.setNome("Rom�rio"); //Note que esse m�todo foi declarado em Atleta, mas est� sendo usado em AtletaFutebol
		jogador.setApelido("Baixinho"); //Note que esse m�todo foi declarado em Atleta, mas est� sendo usado em AtletaFutebol
		jogador.setModalidade("Futebol"); //Note que esse m�todo foi declarado em Atleta, mas est� sendo usado em AtletaFutebol
		jogador.setNumeroCamisa("11"); //Esse m�todo � exclusivo de AtletaFutebol
		jogador.setPosicaoCampo("Centroavante"); //Esse m�todo � exclusivo de AtletaFutebol
		jogador.setGolsMarcados(1002); //Esse m�todo � exclusivo de AtletaFutebol
		
		lutador.setNome("Rafaela Silva");
		lutador.setApelido("Rafa");
		lutador.setModalidade("Jud�");
		lutador.setPeso(56.900);
		lutador.setCategoria("At� 57Kg");
		lutador.setTitulosMundiais(2);
		
		/*Usando o m�todo exibirDados das classes que mostrar�
		 * uma jun��o dos c�digos em Atleta e AtletaFutebol ou AtletaJudo
		 */
		jogador.exibirDados();
		lutador.exibirDados();	
	}
}
