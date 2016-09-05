package br.senac.teclado;

public class AplicacaoTeclado {

	public static void main(String[] args) {
		
		Teclado novoTeclado = new Teclado();
		
		novoTeclado.marca = "Logitech";
		novoTeclado.modelo = "K400";
		novoTeclado.preco = 135.90;
		novoTeclado.anoFabricacao = 2015;
		
		System.out.println("Informações do produto");
		System.out.println("----------------------");
		System.out.println("Marca: " +novoTeclado.marca);
		System.out.println("Modelo: " +novoTeclado.modelo);
		System.out.println("Preço: R$" +novoTeclado.preco);
		System.out.println("Fabricação: " +novoTeclado.anoFabricacao);
		System.out.println("----------------------");
	}
}

