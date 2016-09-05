package br.senac.contabancaria;

public class ContaBancaria {

	//Atributos da Classe Conta
	String numeroConta;
	boolean especial;
	double saldo;

	//Métodos da Classe
	public void sacarValor(double saque){
		saldo = saldo - saque;
	}
	
	public void depositarValor(double deposito){
		saldo = saldo + deposito;
	}

	public double retornarSaldo(){
		return saldo;
	}
	
	public boolean verificarTipoConta(){
		return especial;
	}
}

