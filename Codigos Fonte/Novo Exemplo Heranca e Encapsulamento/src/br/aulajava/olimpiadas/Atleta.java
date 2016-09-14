//Informa��o do pacote onde a classe est� localizada
package br.aulajava.olimpiadas;

/*Essa classe ser� a super classe (ou classe m�e) que conter�
 * os atributos e m�todos que ser�o comuns �s demais classes - Heran�a*/
public class Atleta {

	/*Declarando os atributos da classe com o modificador de acesso
	 * private para evitar que as demais classes acessem diretamente
	 * os atributos - Inicio da configura��o do Encapsulamento*/
	private String nome;
	private String apelido;
	private String modalidade;
	
	/*Criando os m�todos Getters & Setters que far�o 
	 * o acesso de leitura e grava��o aos m�todos*/
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

	/*Criando os demais m�todos da classe
	 *M�todo para exibir os dados da classe na tela*/
	public void exibirDados(){
		System.out.println("Nome do Jogador: " +getNome());
		System.out.println("Posi��o jogada: " +getApelido());
		System.out.println("Modalidade: " +getModalidade());
	}	
}
