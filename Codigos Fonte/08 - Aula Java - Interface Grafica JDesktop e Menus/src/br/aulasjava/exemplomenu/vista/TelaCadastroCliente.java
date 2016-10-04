package br.aulasjava.exemplomenu.vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.aulasjava.exemplomenu.modelo.Cliente;
import br.aulasjava.exemplomenu.persistencia.ClienteDao;

/*Essa tela herda de JInternalFrame e não de JFrame, pois
 * ela é uma tela especial que ficará interna ao sistema
 * não podendo arrastá-la para fora da tela principal
 */
public class TelaCadastroCliente extends JInternalFrame{

	//Atributos da tela
	private JLabel lbNome, lbCpf, lbTel, lbAnoNasc;
	private JTextField cxtNome, cxtCpf, cxtTel, cxtAnoNasc;
	private JButton btnNovo, btnSalvar, btnLimpar, btnFechar;
	private JPanel painelDados, painelBotoes;
	private Cliente novoCliente;
	private ArrayList<JTextField> vetorCaixasTexto;
	private ClienteDao clienteDao;

	//Construtor
	public TelaCadastroCliente(){
		setTitle("Cadastro de Cliente");
		setSize(500,200);
		setLocation(0,0); //posicionando a tela
		/*Os botões de janela minimizar, maximizar e fechar
		 * devem ser colocados manualmente
		 */
		setIconifiable(true);
		setClosable(true);
		setMaximizable(true);

		//Criando os objetos label
		lbNome = new JLabel("Nome");
		lbCpf = new JLabel("CPF");
		lbTel = new JLabel("Telefone");
		lbAnoNasc= new JLabel("Ano Nascimento");

		//Criando os objetos caixa de texto
		cxtNome = new JTextField("");
		cxtCpf = new JTextField("");
		cxtTel = new JTextField("");
		cxtAnoNasc = new JTextField("");

		vetorCaixasTexto = new ArrayList<>();
		vetorCaixasTexto.add(cxtNome);
		vetorCaixasTexto.add(cxtCpf);
		vetorCaixasTexto.add(cxtTel);
		vetorCaixasTexto.add(cxtAnoNasc);

		//Criando os objetos botão
		btnNovo = new JButton("Novo");
		btnSalvar = new JButton("Salvar");
		btnLimpar= new JButton("Limpar campos");
		btnFechar = new JButton("Fechar janela");

		//Criando os paineis de Dados e Botões
		painelDados = new JPanel();
		painelBotoes = new JPanel();

		//Dividindo o layout da janela em dois para os paineis criados
		getContentPane().add(painelDados, BorderLayout.NORTH);
		getContentPane().add(painelBotoes, BorderLayout.SOUTH);

		//Configurando layout dos paineis
		painelDados.setLayout(new GridLayout(4,2,5,5));
		painelBotoes.setLayout(new GridLayout(1,4));

		//Adicionando os campos de dados no painel de dados
		painelDados.add(lbNome);
		painelDados.add(cxtNome);
		painelDados.add(lbCpf);
		painelDados.add(cxtCpf);
		painelDados.add(lbTel);
		painelDados.add(cxtTel);
		painelDados.add(lbAnoNasc);
		painelDados.add(cxtAnoNasc);

		//Adicionando os botões no painel de botões
		painelBotoes.add(btnNovo);
		painelBotoes.add(btnLimpar);
		painelBotoes.add(btnSalvar);
		painelBotoes.add(btnFechar);
		
		//Fazendo os campos "nascerem" desabilitados
		desabilitaCampos(vetorCaixasTexto);

		//Criar o ouvinte e adicionar nos botões
		OuvinteClique ouvinte = new OuvinteClique();
		btnNovo.addActionListener(ouvinte);
		btnLimpar.addActionListener(ouvinte);
		btnSalvar.addActionListener(ouvinte);
		btnFechar.addActionListener(ouvinte);

		setDefaultCloseOperation(HIDE_ON_CLOSE);

	}//fim do construtor

	//Método para controlar a edição dos campos
	private void habilitaCampos(ArrayList<JTextField> vetorCaixaTxt){
		for(int i = 0; i<vetorCaixaTxt.size(); i++){
			vetorCaixaTxt.get(i).setEditable(true);
		}
	}//fim do método habilitaCampos

	//Método para controlar a edição dos campos
	private void desabilitaCampos(ArrayList<JTextField> vetorCaixaTxt){
		for(int i = 0; i<vetorCaixaTxt.size(); i++){
			vetorCaixaTxt.get(i).setEditable(false);
		}
	}//fim do método desabilitaCampos

	//Método para limpar campos
	private void limparCampos(ArrayList<JTextField> vetorCaixaTxt){
		for(int i = 0; i<vetorCaixaTxt.size(); i++){
			vetorCaixaTxt.get(i).setText("");
		}
	}//fim do método limparCampos

	private void novoRegistro(){
		novoCliente = new Cliente();
		habilitaCampos(vetorCaixasTexto);
		limparCampos(vetorCaixasTexto);
	}//fim do método novoCliente

	private void salvarCadastro(){
		if(cxtNome.getText().equals("")||cxtCpf.getText().equals("")||
				cxtTel.getText().equals("")|| cxtAnoNasc.getText().equals("")){
			JOptionPane.showMessageDialog(painelDados, "Preencha todos os campos!", 
					"Atenção", JOptionPane.WARNING_MESSAGE);
		}else{
			novoCliente.setNome(cxtNome.getText());
			novoCliente.setCpf(cxtCpf.getText());
			novoCliente.setTelefone(cxtTel.getText());
			novoCliente.setAnoNascimento(Integer.parseInt(cxtAnoNasc.getText()));
			clienteDao = new ClienteDao();
			clienteDao.gravarDados(novoCliente);
			desabilitaCampos(vetorCaixasTexto);
		}
	}//fim do método salvarCadastro

	private void fechar(){
		this.hide();
	}//fim do método fechar

	//Classe interna ouvinte
	private class OuvinteClique implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent evento) {
			if(evento.getSource() == btnFechar){
				fechar();
			}else if(evento.getSource() == btnSalvar){
				salvarCadastro();
			}else if(evento.getSource() == btnLimpar){
				limparCampos(vetorCaixasTexto);
			}else if(evento.getSource() == btnNovo){
				novoRegistro();
			}
		}
	}//fim da classe interna
	
}//fim da classe TelaCadastroCliente
