package br.aulasjava.veiculos;

public class Carro extends Veiculo{
	
	//Atributos da classe
	private String fabricante;
	private String modelo;
	
	//M�todos construtores
	public Carro() {
		super();
	}
	public Carro(double combustivelMaximo, int numeroMaximoPassageiros, double velocidade,
			String fabricante, String modelo) {
		super(combustivelMaximo, numeroMaximoPassageiros, velocidade);
		this.fabricante = fabricante;
		this.modelo = modelo;
	}
	
	//M�todos Getters & Setters
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//M�todos espec�ficos da Classe
	public String manobrar(){
		return "Manobrando carro.";
	}
}
