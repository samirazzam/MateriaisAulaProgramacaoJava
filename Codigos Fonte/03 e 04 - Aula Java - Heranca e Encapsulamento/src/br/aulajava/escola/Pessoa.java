package br.aulajava.escola;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String cpf;
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pessoa(String nome, String endereco, String cpf) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String exibeDados(){
		String textoFormatado = "Nome: " +this.nome +"\n"
				+"Endereço: " +this.endereco +"\n"
				+"CPF: " +this.cpf +"\n";
		return textoFormatado;
	}
}
