/*Informação do pacote onde a classe está localizada*/
package br.aulajava.olimpiadas;

/*Classe mais especializada que vai herdar de Atleta 
 * através da palavra reservada do Java: extends*/
public class AtletaJudo extends Atleta{

	/*Atributos específicos da classe AtletaJudo.
	 *Essa classe tem como atributos os declarados na 
	 *classe Atleta mais os descritos abaixo*/
	private double peso;
	private String categoria;
	private int titulosMundiais;
	
	/*Criando os métodos Getters & Setters que farão 
	 * o acesso de leitura e gravação aos métodos*/
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
	
	/*Criando os demais métodos da classe. Sobreescrevendo o método 
	 * para exibir os dados da classe na tela. Esse método juntará
	 * o código escrito na classe Atleta, mais o complemento abaixo*/
	@Override
	public void exibirDados() {
		System.out.println("----Judoca----");
		//Chamando o código do método exibirDados da super classe
		super.exibirDados();
		//Completando com os dados específicos da classe JogadorFutebol
		System.out.println("Peso do atleta: " +getPeso() +"kg");
		System.out.println("Categoria: " +getCategoria());
		System.out.println("Títulos Mundiais: " +getTitulosMundiais());
	}
	
	
	
}
