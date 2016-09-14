package br.aulasjava.veiculos;

public class AplicacaoVeiculos {
	
	public static void main(String[] args) {
		
		/*Criando objetos das classes Aviao e Carro, passando
		 * os valores dos atributos via contrutores*/
		Aviao aviao747 = new Aviao(238000.00, 410, 0, 12000.00, 955, 4);
		Carro carroPessoal = new Carro(40, 5, 0, "Fiat", "Uno");
		
		//Mostrando os dados na tela
		System.out.println("Dados do avião \n"
				+"Tanque: " +aviao747.getCombustivelMaximo() +" Litros \n"
				+"Capacidade de passageiros: " +aviao747.getNumeroMaximoPassageiros() +"\n"
				+"Numero de motores: " +aviao747.getNumeroDeMotores());
		System.out.println("-------------------------------");
		System.out.println("Dados do carro \n"
				+"Modelo do carro: " +carroPessoal.getModelo() +"\n"
				+"Fabricante: " +carroPessoal.getFabricante() +"\n"
				+"Número máx de passageiros: " +carroPessoal.getNumeroMaximoPassageiros());
		System.out.println("-------------------------------");
		
		//Fazendo uso alguns métodos Getters & Setters
		//Acertando o combustível máximo do avião
		System.out.println("Combustível Máx do avião: " +aviao747.getCombustivelMaximo() +" Litros");
		System.out.println("-------------------------------");
		aviao747.setCombustivelMaximo(225000.00);
		System.out.println("Combustível Máx do avião: " +aviao747.getCombustivelMaximo() +" Litros");
		System.out.println("-------------------------------");
		
		//Trocando o modelo do carro
		System.out.println("Nome antigo do modelo: " +carroPessoal.getModelo());
		carroPessoal.setModelo("Novo Uno");
		System.out.println("Nome do modelo alterado para: " +carroPessoal.getModelo());
		System.out.println("-------------------------------");
		
		//Usando alguns dos métodos do objeto avião
		System.out.println(aviao747.taxiar());
		System.out.println(aviao747.decolar());
		System.out.println(aviao747.aterrissar());
		System.out.print("Velocidade do avião para inicio do procedimento de aterrissagem: ");
		System.out.printf("%.2f", aviao747.getVelocidade());
		System.out.println("km/h");
		System.out.println("-------------------------------");
		
		//Usando alguns métodos do objeto carro
		//Acelerando o carro em 3m/s² e 10s
		carroPessoal.acelerar(3, 10);
		System.out.println("Velocidade do carro está em: " +carroPessoal.getVelocidade() +" m/s"
				+"ou " +carroPessoal.getVelocidade()*3.6 +"km/h");
		System.out.println("-------------------------------");
		
		//Desacelerando o carro em 1.2m/s² e 6s
		carroPessoal.desacelerar(1.2, 6);
		System.out.println("Velocidade do carro está em: " +carroPessoal.getVelocidade() +" m/s"
				+"ou " +carroPessoal.getVelocidade()*3.6 +"km/h");
		System.out.println("-------------------------------");
	}

}
