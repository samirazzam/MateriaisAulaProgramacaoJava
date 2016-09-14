/*Informação do pacote onde a classe está localizada*/
package br.aulajava.olimpiadas;

/*Classe mais especializada que vai herdar de Atleta 
 * através da palavra reservada do Java: extends*/
public class AtletaFutebol extends Atleta{

	/*Atributos específicos da classe AtletaFutebol.
	 *Essa classe tem como atributos os declarados na 
	 *classe Atleta mais os descritos abaixo*/
	private String numeroCamisa;
	private String posicaoCampo;
	private int golsMarcados;
	
	/*Criando os métodos Getters & Setters que farão 
	 * o acesso de leitura e gravação aos métodos*/
	public String getPosicaoCampo() {
		return posicaoCampo;
	}
	public void setPosicaoCampo(String posicaoCampo) {
		this.posicaoCampo = posicaoCampo;
	}
	public int getGolsMarcados() {
		return golsMarcados;
	}
	public void setGolsMarcados(int golsMarcados) {
		this.golsMarcados = golsMarcados;
	}
	public String getNumeroCamisa() {
		return getNumeroCamisa();
	}
	public void setNumeroCamisa(String numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}

	/*Criando os demais métodos da classe. Sobreescrevendo o método 
	 * para exibir os dados da classe na tela. Esse método juntará
	 * o código escrito na classe Atleta, mais o complemento abaixo*/
	@Override //Marcação para indicar que o método abaixo é sobreescrito
	public void exibirDados(){
		System.out.println("----Jogador de Futebol----");
		//Chamando o código do método exibirDados da super classe
		super.exibirDados();
		//Completando com os dados específicos da classe JogadorFutebol
		System.out.println("Posição no Campo: " +getPosicaoCampo());
		System.out.println("Número de gols na carreira: " +getGolsMarcados());
	}
}
