public class VerificacaoCompra {

	//Declaração da função/método principal: main 
	public static void main(String[] args) {
		
		//Declarando duas variáveis
		double valorCompra1;
		double valorCompra2;
		
		//Atribuindo valor nas variáveis
		valorCompra1 = 89.99;
		valorCompra2 = 70.50;
		
		//Declarando outra variável e inicializando em seguida
		double somaCompra = valorCompra1 + valorCompra2;
		
		//Decisão a ser tomada para mensagem na tela (desvio condicional)
		if(somaCompra<=100){
			//Mensagem na tela concatenando texto
			System.out.println("O valor R$" +somaCompra +" está abaixo do mínimo. Compre mais produtos.");
		}else{
			System.out.println("O valor R$" +somaCompra +" está liberado para pagamento.");
		}
	}//fim do método main
}//fim da classe


