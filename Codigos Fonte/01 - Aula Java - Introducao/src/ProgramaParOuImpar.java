//Usando a API Java JOptionPane
import javax.swing.JOptionPane;

public class ProgramaParOuImpar {

	public static void main(String[] args) {
		/*Declarando variável para receber entrada
		 *do teclado*/
		String entradaValor;
		//Lendo o valor do teclado
		entradaValor = JOptionPane.showInputDialog("Digite o número para saber se é par ou ímpar");
		
		/*Porém todo valor lido por JOptionPane é
		 * do tipo String. É necessário converter
		 * para número inteiro.*/
		int numero = Integer.parseInt(entradaValor);
		
		//Verificando se é par ou ímpar
		if (numero % 2 == 0){
			JOptionPane.showMessageDialog(null, "O número " +numero +" é par!");
		}else{
			JOptionPane.showMessageDialog(null, "O número " +numero +" é ímpar!");
		}
	}//fim do método main
}//fim da classe

