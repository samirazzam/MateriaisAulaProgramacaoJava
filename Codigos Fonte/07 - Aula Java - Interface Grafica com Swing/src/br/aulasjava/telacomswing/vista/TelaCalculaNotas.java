package br.aulasjava.telacomswing.vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.aulasjava.telacomswing.modelo.Aluno;

//A classe herda da classe de telas do Swing: JFrame
public class TelaCalculaNotas extends JFrame{

	//Atributos que parte dos componentes da tela
	private JLabel lbNome, lbNota1, lbNota2, lbMedia; //Label ou rótulos
	private JTextField cxtNome, cxtNota1, cxtNota2, cxtMedia; //Caixas de texto
	private JButton btnCalcularMedia, btnImprimir; //Botão
	private Aluno novoAluno;
	
	//Construtor da classe que vai montar a tela
	public TelaCalculaNotas(){
		//Colocando um título na janela da tela
		setTitle("Programa para cálculo de médias sobre avaliações");
		//Configura o tamanho da tela
		setSize(400,200);
		//Posiciona a tela no meio do monitor
		setLocationRelativeTo(null);
		
		//Instanciando os componentes da tela: Label
		lbNome = new JLabel("Nome:");
		lbNota1 = new JLabel("Nota da AV1:");
		lbNota2 = new JLabel("Nota da AV2:");
		lbMedia = new JLabel("Media final:");
		
		//Instanciando os componentes da tela: Caixa de texto
		cxtNome = new JTextField("");
		cxtNota1 = new JTextField("");
		cxtNota2 = new JTextField("");
		cxtMedia = new JTextField("");
		
		//Instanciando os componentes da tela: Caixa de texto
		btnCalcularMedia = new JButton("Calcular média");
		btnImprimir = new JButton("Imprimir");
		
		//Configurando a caixa de texto da média como não editável
		cxtMedia.setEditable(false);
		
		//Criando o painel principal que alocará os componentes
		JPanel painel = new JPanel();
		
		/*Configurando o layout da tela: GridLayout
		 * 5 linhas, 2 colunas, 
		 * Espaçamento horizontal 5
		 * Espaçamento vertical 5 
		 */
		painel.setLayout(new GridLayout(5,2,5,5));
		
		/*Adicionando os componentes no painel
		 *A ordem da adição determina a distribuição
		 *dos componentes na tela
		 */
		painel.add(lbNome);
		painel.add(cxtNome);
		painel.add(lbNota1);
		painel.add(cxtNota1);
		painel.add(lbNota2);
		painel.add(cxtNota2);
		painel.add(lbMedia);
		painel.add(cxtMedia);
		painel.add(btnCalcularMedia);
		painel.add(btnImprimir);
		
		//Atribuir o novo painel dentro da janela/tela
		setContentPane(painel);
		
		//Instanciando um Aluno para receber e tratar os dados
		novoAluno = new Aluno();
		
		/*Criando o ouvinte da tela, objeto que 
		 * ficará escutando os eventos para capturar
		 * o clique do botão.
		 */
		OuvinteClique ouvinte = new OuvinteClique();
		
		//Adicionando os ouvintes nos botões
		btnCalcularMedia.addActionListener(ouvinte);
		btnImprimir.addActionListener(ouvinte);
		
		//Configurando a saida do programa (fechar tela)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}//fim do construtor
	
	/*Criando uma classe interna que será usada apenas pela TelaCalculaNotas
	 * Classes internas são conhecidas por Inner classes ou Nested Classes
	 */
	private class OuvinteClique implements ActionListener{

		//Método que vai tratar os eventos de botão da tela
		@Override
		public void actionPerformed(ActionEvent evento) {
			Object objetoEvento = evento.getSource();
			
			if(objetoEvento == btnCalcularMedia){
				if (cxtNome.getText().equals("")||cxtNota1.getText().equals("")||
						cxtNota2.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Preencha todos os campos");
					cxtMedia.setText("");
				}else{
					novoAluno.setNome(cxtNome.getText());
					novoAluno.setNota1(Double.parseDouble(cxtNota1.getText()));
					novoAluno.setNota2(Double.parseDouble(cxtNota2.getText()));
					novoAluno.calcularMedia();
					cxtMedia.setText(String.valueOf(novoAluno.getMedia()));
				}
			}else if(objetoEvento == btnImprimir){
				String saida = "Nome do aluno: " +novoAluno.getNome() +"\n"
				+"Nota da AV1: " +novoAluno.getNota1() +"\n"
				+"Nota da AV2: " +novoAluno.getNota2() +"\n"
				+"Média final: " +String.format("%.2f", novoAluno.getMedia());
				JOptionPane.showMessageDialog(null, saida);
			}	
		}
		
	}//fim da classe interna

}//fim da classe TelaCalculaNotas


