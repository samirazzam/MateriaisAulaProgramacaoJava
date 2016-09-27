package br.aulasjava.exemplomenu.persistencia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JOptionPane;

import br.aulasjava.exemplomenu.modelo.Cliente;

public class ClienteDao {

	//Atributo do tipo arquivo
	private File arquivo;

	//Construtor da classe
	public ClienteDao(Cliente cliente){
		arquivo = new File("BancoDadosCliente.txt");
		if(!arquivo.exists()){
			criarArquivo();
		}

		//Escrita do dados no arquivo, tratando possíveis erros
		try {
			FileWriter gravadorArquivo = new FileWriter(arquivo,true);
			BufferedWriter bufferTexto = new BufferedWriter(gravadorArquivo);
			bufferTexto.append(cliente.getNome() +" ");
			bufferTexto.append(cliente.getCpf() +" ");
			bufferTexto.append(cliente.getTelefone() +" ");
			bufferTexto.append(cliente.getAnoNascimento()+"\n");
			bufferTexto.newLine();
			bufferTexto.close();
			gravadorArquivo.close();
			JOptionPane.showMessageDialog(null, "Dados gravados com sucesso.");

		} catch (Exception evento) {
			JOptionPane.showMessageDialog(null, "Erro ao gravar dados: " +evento.getMessage());
		}
	}//fim do construtor

	//Método para criar o arquivo vazio no HD
	public void criarArquivo(){
		try {
			arquivo.createNewFile();
		} catch (Exception evento) {
			System.out.println("Erro ao gerar arquivo: " +evento.getMessage());
		}
	}
}