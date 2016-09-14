package br.aulasjava.banco;

import java.text.DecimalFormat;

public class Conta {

	//Atributos da classe
	protected String numero;
	protected double saldo;
	
	//Métodos construtores
	public Conta(){
		//método vazio
	}

	public Conta(String numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	//Métodos Getters & Setters
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Métodos específicos da classe
	public String formatarDecimais(double numero){
		DecimalFormat numeroDecimal = new DecimalFormat("#.##");
		return numeroDecimal.format(numero);
	}
	
	public void exibirSaldo(){
		System.out.println("Saldo atual: " +formatarDecimais(getSaldo()));
	}
	
	public void sacar(double valorSaque){
		if(saldo < valorSaque){
			System.out.println("Saldo insuficiente.");
		}else{
			saldo = saldo - valorSaque;
			System.out.println("Saque de R$" +valorSaque +" realizado");
			exibirSaldo();
		}
	}
	
	public void depositar(double valorDeposito){
		if (valorDeposito <= 0){
			System.out.println("Deposito incorreto: valor negativo ou zero");
		}else{
			saldo = saldo +valorDeposito;
			System.out.println("Deposito de R$" +valorDeposito +" realizado");
			exibirSaldo();
		}
	}
	
	public void apresentarConta(){
		System.out.println("Número da conta: " +getNumero());
	}
}
