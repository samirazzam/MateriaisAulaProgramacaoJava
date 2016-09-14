package br.aulajava.olimpiadas;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		//Criando objetos do tipo AtletaFutebol e AtletaJudo
		AtletaFutebol jogador = new AtletaFutebol();
		AtletaJudo lutador = new AtletaJudo();
		
		//Carregando os dados nos atributos das classes
		jogador.setNome("Romário"); //Note que esse método foi declarado em Atleta, mas está sendo usado em AtletaFutebol
		jogador.setApelido("Baixinho"); //Note que esse método foi declarado em Atleta, mas está sendo usado em AtletaFutebol
		jogador.setModalidade("Futebol"); //Note que esse método foi declarado em Atleta, mas está sendo usado em AtletaFutebol
		jogador.setNumeroCamisa("11"); //Esse método é exclusivo de AtletaFutebol
		jogador.setPosicaoCampo("Centroavante"); //Esse método é exclusivo de AtletaFutebol
		jogador.setGolsMarcados(1002); //Esse método é exclusivo de AtletaFutebol
		
		lutador.setNome("Rafaela Silva");
		lutador.setApelido("Rafa");
		lutador.setModalidade("Judô");
		lutador.setPeso(56.900);
		lutador.setCategoria("Até 57Kg");
		lutador.setTitulosMundiais(2);
		
		/*Usando o método exibirDados das classes que mostrará
		 * uma junção dos códigos em Atleta e AtletaFutebol ou AtletaJudo
		 */
		jogador.exibirDados();
		lutador.exibirDados();	
	}
}
