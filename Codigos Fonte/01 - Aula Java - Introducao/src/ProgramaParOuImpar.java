//Usando a API Java JOptionPane
import javax.swing.JOptionPane;

public class ProgramaParOuImpar {

	public static void main(String[] args) {
		/*Declarando vari�vel para receber entrada
		 *do teclado*/
		String entradaValor;
		//Lendo o valor do teclado
		entradaValor = JOptionPane.showInputDialog("Digite o n�mero para saber se � par ou �mpar");
		
		/*Por�m todo valor lido por JOptionPane �
		 * do tipo String. � necess�rio converter
		 * para n�mero inteiro.*/
		int numero = Integer.parseInt(entradaValor);
		
		//Verificando se � par ou �mpar
		if (numero % 2 == 0){
			JOptionPane.showMessageDialog(null, "O n�mero " +numero +" � par!");
		}else{
			JOptionPane.showMessageDialog(null, "O n�mero " +numero +" � �mpar!");
		}
	}//fim do m�todo main
}//fim da classe

