package br.aulasjava.veiculos;

public class Aviao extends Veiculo{
	
	//Atributos da classe
	private double altitudeMaxima;
	private double velocidadeMaxima;
	private int numeroDeMotores;
	
	//M�todos construtores
	public Aviao() {
		super();
	}
	public Aviao(double combustivelMaximo, int numeroMaximoPassageiros, double velocidade,
			double altitudeMaxima, double velocidadeMaxima, int numeroDeMotores) {
		super(combustivelMaximo, numeroMaximoPassageiros, velocidade);
		this.altitudeMaxima = altitudeMaxima;
		this.velocidadeMaxima = velocidadeMaxima;
		this.numeroDeMotores = numeroDeMotores;
	}
	
	//M�todos Getters & Setters
	public double getAltitudeMaxima() {
		return altitudeMaxima;
	}
	public void setAltitudeMaxima(double altitudeMaxima) {
		this.altitudeMaxima = altitudeMaxima;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public int getNumeroDeMotores() {
		return numeroDeMotores;
	}
	public void setNumeroDeMotores(int numeroDeMotores) {
		this.numeroDeMotores = numeroDeMotores;
	}
	
	//M�todos espec�ficos da classe
	public String taxiar(){
		return "Aten��o o avi�o est� taxiando na pista";
	}
	
	public String decolar(){
		setVelocidade(velocidadeMaxima/8);
		return "O avi�o est� decolando em velocidade: " +getVelocidade() +"km/h";
	}
	public String aterrissar(){
		setVelocidade(velocidadeMaxima/3);
		return "Por favor afivelem os cintos para a aterrissagem.";
	}
}
