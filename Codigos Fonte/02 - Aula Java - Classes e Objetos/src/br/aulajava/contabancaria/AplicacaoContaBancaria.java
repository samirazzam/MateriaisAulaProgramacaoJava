package br.aulajava.contabancaria;

import javax.swing.JOptionPane;

public class AplicacaoContaBancaria {

	public static void main(String[] args) {
		
		//Instânciando um objeto da Classe ContaBancaria
		ContaBancaria novaConta;
		novaConta = new ContaBancaria();
		
		novaConta.numeroConta = "25998-7";
		novaConta.especial = true;
		novaConta.saldo = 9500.00;
		
		
		//Realizando operação de saque
		String entradaDados = JOptionPane.showInputDialog("Digite o valor para saque");
		double valorTransacao = Double.parseDouble(entradaDados);
		novaConta.sacarValor(valorTransacao);
		JOptionPane.showMessageDialog(null, "Saldo da conta R$" +novaConta.retornarSaldo());
		
		//Realizando operação de depósito
		entradaDados = JOptionPane.showInputDialog("Digite o valor para deposito");
		valorTransacao = Double.parseDouble(entradaDados);
		novaConta.depositarValor(valorTransacao);
		JOptionPane.showMessageDialog(null, "Saldo da conta R$" +novaConta.retornarSaldo());
		
		//Verificando o tipo de conta
		boolean tipoConta = novaConta.verificarTipoConta();
		if (tipoConta == true){
			JOptionPane.showMessageDialog(null, "Conta do tipo Especial");
		}else{
			JOptionPane.showMessageDialog(null, "Conta do tipo Comum");
		}
	}
}

