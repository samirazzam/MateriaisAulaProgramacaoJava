public class VerificacaoCompra {

	//Declara��o da fun��o/m�todo principal: main 
	public static void main(String[] args) {
		
		//Declarando duas vari�veis
		double valorCompra1;
		double valorCompra2;
		
		//Atribuindo valor nas vari�veis
		valorCompra1 = 89.99;
		valorCompra2 = 70.50;
		
		//Declarando outra vari�vel e inicializando em seguida
		double somaCompra = valorCompra1 + valorCompra2;
		
		//Decis�o a ser tomada para mensagem na tela (desvio condicional)
		if(somaCompra<=100){
			//Mensagem na tela concatenando texto
			System.out.println("O valor R$" +somaCompra +" est� abaixo do m�nimo. Compre mais produtos.");
		}else{
			System.out.println("O valor R$" +somaCompra +" est� liberado para pagamento.");
		}
	}//fim do m�todo main
}//fim da classe


