package br.aulasjava.banco;

public class ContaCorrente extends Conta{

	//Atributos da classe
	private double taxaServicoCC;

	//M�todos construtores
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String numero, double saldo, double taxaServicoCC) {
		super(numero, saldo);
		this.taxaServicoCC = taxaServicoCC;
	}

	//M�todos Getters & Setters
	public double getTaxaServicoCC() {
		return taxaServicoCC;
	}

	public void setTaxaServicoCC(double taxaServicoCC) {
		this.taxaServicoCC = taxaServicoCC;
	}
	
	//M�todos espec�ficos da classe
	public void descontarTaxaServico(){
		this.saldo = this.saldo - taxaServicoCC;
	}

	@Override
	public void apresentarConta() {
		System.out.println("####Dados da Conta Corrente####");
		super.apresentarConta();
		System.out.println("Valor da taxa de servi�o: " +getTaxaServicoCC());
	}
}
