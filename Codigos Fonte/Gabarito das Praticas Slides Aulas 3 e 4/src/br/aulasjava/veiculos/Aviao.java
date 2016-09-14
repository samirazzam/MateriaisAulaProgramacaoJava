package br.aulasjava.veiculos;

public class Aviao extends Veiculo{
	
	//Atributos da classe
	private double altitudeMaxima;
	private double velocidadeMaxima;
	private int numeroDeMotores;
	
	//Métodos construtores
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
	
	//Métodos Getters & Setters
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
	
	//Métodos específicos da classe
	public String taxiar(){
		return "Atenção o avião está taxiando na pista";
	}
	
	public String decolar(){
		setVelocidade(velocidadeMaxima/8);
		return "O avião está decolando em velocidade: " +getVelocidade() +"km/h";
	}
	public String aterrissar(){
		setVelocidade(velocidadeMaxima/3);
		return "Por favor afivelem os cintos para a aterrissagem.";
	}
}
