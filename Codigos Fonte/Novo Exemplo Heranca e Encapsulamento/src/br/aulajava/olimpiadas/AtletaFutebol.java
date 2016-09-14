/*Informa��o do pacote onde a classe est� localizada*/
package br.aulajava.olimpiadas;

/*Classe mais especializada que vai herdar de Atleta 
 * atrav�s da palavra reservada do Java: extends*/
public class AtletaFutebol extends Atleta{

	/*Atributos espec�ficos da classe AtletaFutebol.
	 *Essa classe tem como atributos os declarados na 
	 *classe Atleta mais os descritos abaixo*/
	private String numeroCamisa;
	private String posicaoCampo;
	private int golsMarcados;
	
	/*Criando os m�todos Getters & Setters que far�o 
	 * o acesso de leitura e grava��o aos m�todos*/
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

	/*Criando os demais m�todos da classe. Sobreescrevendo o m�todo 
	 * para exibir os dados da classe na tela. Esse m�todo juntar�
	 * o c�digo escrito na classe Atleta, mais o complemento abaixo*/
	@Override //Marca��o para indicar que o m�todo abaixo � sobreescrito
	public void exibirDados(){
		System.out.println("----Jogador de Futebol----");
		//Chamando o c�digo do m�todo exibirDados da super classe
		super.exibirDados();
		//Completando com os dados espec�ficos da classe JogadorFutebol
		System.out.println("Posi��o no Campo: " +getPosicaoCampo());
		System.out.println("N�mero de gols na carreira: " +getGolsMarcados());
	}
}
