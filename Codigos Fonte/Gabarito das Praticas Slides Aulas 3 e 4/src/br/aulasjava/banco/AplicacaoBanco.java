package br.aulasjava.banco;

public class AplicacaoBanco {
	
	public static void main(String[] args) {
		
		//Criando os objetos
		ContaCorrente corrente = new ContaCorrente("15669-7", 2532.66, 3.50);
		ContaPoupanca poupanca = new ContaPoupanca("56668-1", 5203.10, 1.27);
		
		//Fazendo um dep�sito na Conta Corrente
		System.out.println("C/C: " +corrente.getNumero());
		corrente.exibirSaldo();
		corrente.depositar(800.00);
		System.out.println("------------------------------");
	
		//Realizando um saque da Poupan�a
		System.out.println("Poupan�a: " +poupanca.getNumero());
		poupanca.exibirSaldo();
		poupanca.sacar(1050.00);
		System.out.println("------------------------------");
		
		//Descontando a Taxa de servi�o
		System.out.println("C/C: " +corrente.getNumero());
		corrente.exibirSaldo();
		System.out.println("Descontando a taxa de servi�o R$" +corrente.getTaxaServicoCC());
		corrente.descontarTaxaServico();
		corrente.exibirSaldo();
		System.out.println("------------------------------");
		
		//Aplicando rendimento da poupan�a
		System.out.println("Poupan�a: " +corrente.getNumero());
		poupanca.exibirSaldo();
		System.out.println("Anivers�rio da conta - aplicando rendimento");
		poupanca.aplicarRendimento();
		poupanca.exibirSaldo();
		System.out.println("------------------------------");
		
		//Apresentando dados das contas:
		corrente.apresentarConta();
		System.out.println("------------------------------");
		poupanca.apresentarConta();
	}

}
