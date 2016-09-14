//Informação do pacote onde a classe está localizada
package br.aulajava.olimpiadas;

/*Essa classe será a super classe (ou classe mãe) que conterá
 * os atributos e métodos que serão comuns às demais classes - Herança*/
public class Atleta {

	/*Declarando os atributos da classe com o modificador de acesso
	 * private para evitar que as demais classes acessem diretamente
	 * os atributos - Inicio da configuração do Encapsulamento*/
	private String nome;
	private String apelido;
	private String modalidade;
	
	/*Criando os métodos Getters & Setters que farão 
	 * o acesso de leitura e gravação aos métodos*/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	/*Criando os demais métodos da classe
	 *Método para exibir os dados da classe na tela*/
	public void exibirDados(){
		System.out.println("Nome do Jogador: " +getNome());
		System.out.println("Posição jogada: " +getApelido());
		System.out.println("Modalidade: " +getModalidade());
	}	
}
