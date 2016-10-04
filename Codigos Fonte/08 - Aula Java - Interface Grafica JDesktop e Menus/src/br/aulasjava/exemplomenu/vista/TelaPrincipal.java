package br.aulasjava.exemplomenu.vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import br.aulasjava.exemplomenu.persistencia.ClienteDao;

public class TelaPrincipal extends JFrame{
	
	//Atributos dos objetos de composição da tela principal
	private JMenuBar menuBarra;
	private JMenu menuCadastro, menuPesquisa;
	private JMenuItem itemCadastroCliente, itemSair, itemPesquisaCliente, itemLerArquivo;
	private JDesktopPane painelDesktop;
	private TelaCadastroCliente telaCadastroCliente;

	//Construtor da Classe
	public TelaPrincipal(){
		
		//Configuração inicial da tela
		setTitle("Programa de Cadastro de Clientes");
		setSize(800,500);
		setLocationRelativeTo(null);
		
		//Criando os objetos da tela
		//Painel (container) principal
		painelDesktop = new JDesktopPane();
		painelDesktop.setBackground(Color.DARK_GRAY);
		add(painelDesktop);
		
		//Barra de menu, menu e item de menu
		menuBarra = new JMenuBar();
		menuCadastro = new JMenu("Cadastro");
		menuPesquisa = new JMenu("Pesquisa");
		itemCadastroCliente = new JMenuItem("Cadastro de clientes");
		itemSair = new JMenuItem("Sair do programa");
		itemPesquisaCliente = new JMenuItem("Pesquisar cliente por CPF");
		itemLerArquivo = new JMenuItem("Ler arquivo de cadastro");
		//Adicionando menus na barra
		menuBarra.add(menuCadastro);
		menuBarra.add(menuPesquisa);
		//Adicionando os itens de menu nos menus
		menuCadastro.add(itemCadastroCliente);
		menuCadastro.addSeparator(); //Linha para separar os menus
		menuCadastro.add(itemSair);
		menuPesquisa.add(itemPesquisaCliente);
		menuPesquisa.addSeparator();
		menuPesquisa.add(itemLerArquivo);
		//Adicionando a barra de menu na janela
		setJMenuBar(menuBarra);
		
		//Instaciando o objeto Ouvinte
		OuvinteClique ouvinte = new OuvinteClique();
		
		//Adicionado o ouvinte nos itens de menu
		itemCadastroCliente.addActionListener(ouvinte);
		itemPesquisaCliente.addActionListener(ouvinte);
		itemSair.addActionListener(ouvinte);
		itemLerArquivo.addActionListener(ouvinte);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	/*Método especializado para encerrar o programa, será chamado
	 * no tratador de eventos OuvinteClique.
	 */
	private void sairPrograma(){
		int resposta = JOptionPane.showConfirmDialog(painelDesktop, "Deseja encerrar o programa?", 
				"Fechar programa", JOptionPane.YES_NO_OPTION);
		if(resposta == JOptionPane.YES_OPTION){
			this.dispose();
		}
	}//fim método sairPrograma
	
	//Classe interna Listener
	private class OuvinteClique implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent evento) {
			//Checa se o menu acionado foi o de cadastro ou pesquisa ou sair
			if (evento.getSource() == itemCadastroCliente){
				//Código para não permitir a abertura de N telas sobrepostas
				if(telaCadastroCliente == null){
					telaCadastroCliente = new TelaCadastroCliente();
					painelDesktop.add(telaCadastroCliente);
					telaCadastroCliente.setVisible(true);
				}else{
					telaCadastroCliente.setVisible(true);
					painelDesktop.moveToFront(telaCadastroCliente);
				}
			}else if(evento.getSource() == itemPesquisaCliente){
				JOptionPane.showMessageDialog(painelDesktop, "Funcionalidade em desenvolvimento.","Atenção", JOptionPane.WARNING_MESSAGE);
			}
			else if (evento.getSource() == itemSair){
				sairPrograma(); //itemSair que chama o método privado sairPrograma, escrito lá em cima
			}
			else if (evento.getSource() == itemLerArquivo){
				JOptionPane.showMessageDialog(painelDesktop, ClienteDao.lerDados());
			}
		}
	}//fim classe interna
	
	public static void main(String[] args) {
		TelaPrincipal novaTela = new TelaPrincipal();
		novaTela.setVisible(true);
	}//fim do método main
	
}//fim da classe
