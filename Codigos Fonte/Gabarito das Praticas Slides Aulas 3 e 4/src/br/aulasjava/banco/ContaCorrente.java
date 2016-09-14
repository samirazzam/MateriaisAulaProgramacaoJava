package br.aulasjava.banco;

public class ContaCorrente extends Conta{

	//Atributos da classe
	private double taxaServicoCC;

	//Métodos construtores
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String numero, double saldo, double taxaServicoCC) {
		super(numero, saldo);
		this.taxaServicoCC = taxaServicoCC;
	}

	//Métodos Getters & Setters
	public double getTaxaServicoCC() {
		return taxaServicoCC;
	}

	public void setTaxaServicoCC(double taxaServicoCC) {
		this.taxaServicoCC = taxaServicoCC;
	}
	
	//Métodos específicos da classe
	public void descontarTaxaServico(){
		this.saldo = this.saldo - taxaServicoCC;
	}

	@Override
	public void apresentarConta() {
		System.out.println("####Dados da Conta Corrente####");
		super.apresentarConta();
		System.out.println("Valor da taxa de serviço: " +getTaxaServicoCC());
	}
}
