/*Esse é um exemplo de aplicação simples para teste*/

package br.senac.cachorroadestrado;

public class AplicacaoCachorro {

	public static void main(String[] args) {
		
		Cachorro novoCao = new Cachorro();
		
		novoCao.nome = "Bidu";
		novoCao.raca = "Schnauzer";
		novoCao.corPelo = "Azul";
		novoCao.peso = 6.5;
		
		novoCao.latir();
		novoCao.sentar();
	}
}
