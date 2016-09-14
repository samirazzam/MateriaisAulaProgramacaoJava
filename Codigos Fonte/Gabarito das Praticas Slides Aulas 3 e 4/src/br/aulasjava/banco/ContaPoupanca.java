package br.aulasjava.banco;

public class ContaPoupanca extends Conta{

	//Atributos
	private double rendimentoPoup;

	public ContaPoupanca() {
		super();
	}

	//Métodos construtores
	public ContaPoupanca(String numero, double saldo, double rendimentoPoup) {
		super(numero, saldo);
		this.rendimentoPoup = rendimentoPoup;
	}

	//Métodos Getters & Setters
	public double getRendimentoPoup() {
		return rendimentoPoup;
	}

	public void setRendimentoPoup(double rendimentoPoup) {
		this.rendimentoPoup = rendimentoPoup;
	}

	//Métodos específicos da classe
	public void aplicarRendimento(){
		saldo = saldo + (saldo * rendimentoPoup/100);
	}
	
	@Override
	public void apresentarConta(){
		System.out.println("####Dados da Conta Poupança####");
		super.apresentarConta();
		System.out.println("Percentual para rendimento: " +getRendimentoPoup() +"%");
	}
}
