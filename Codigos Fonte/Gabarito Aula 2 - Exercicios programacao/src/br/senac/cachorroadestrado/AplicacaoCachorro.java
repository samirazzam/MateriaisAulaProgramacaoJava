/*Esse � um exemplo de aplica��o simples para teste*/

package br.senac.cachorroadestrado;

public class AplicacaoCachorro {

	public static void main(String[] args) {
		
		//Criando um novo objeto do tipo Cachorro
		Cachorro novoCao = new Cachorro();
		
		//Inicializando os valores dos atributos
		novoCao.nome = "Bidu";
		novoCao.raca = "Schnauzer";
		novoCao.corPelo = "Azul";
		novoCao.peso = 6.5;
		
		//Chamando os m�todos
		novoCao.latir();
		novoCao.sentar();
	}
}
