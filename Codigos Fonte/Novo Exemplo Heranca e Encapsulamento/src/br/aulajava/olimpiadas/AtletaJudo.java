/*Informa��o do pacote onde a classe est� localizada*/
package br.aulajava.olimpiadas;

/*Classe mais especializada que vai herdar de Atleta 
 * atrav�s da palavra reservada do Java: extends*/
public class AtletaJudo extends Atleta{

	/*Atributos espec�ficos da classe AtletaJudo.
	 *Essa classe tem como atributos os declarados na 
	 *classe Atleta mais os descritos abaixo*/
	private double peso;
	private String categoria;
	private int titulosMundiais;
	
	/*Criando os m�todos Getters & Setters que far�o 
	 * o acesso de leitura e grava��o aos m�todos*/
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getTitulosMundiais() {
		return titulosMundiais;
	}
	public void setTitulosMundiais(int titulosMundiais) {
		this.titulosMundiais = titulosMundiais;
	}
	
	/*Criando os demais m�todos da classe. Sobreescrevendo o m�todo 
	 * para exibir os dados da classe na tela. Esse m�todo juntar�
	 * o c�digo escrito na classe Atleta, mais o complemento abaixo*/
	@Override
	public void exibirDados() {
		System.out.println("----Judoca----");
		//Chamando o c�digo do m�todo exibirDados da super classe
		super.exibirDados();
		//Completando com os dados espec�ficos da classe JogadorFutebol
		System.out.println("Peso do atleta: " +getPeso() +"kg");
		System.out.println("Categoria: " +getCategoria());
		System.out.println("T�tulos Mundiais: " +getTitulosMundiais());
	}
	
	
	
}
