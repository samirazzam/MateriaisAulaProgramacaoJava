package br.aulasjava.empresa;

import java.util.ArrayList;

public class AplicacaoEmpresa {
	
	public static void main(String[] args) {
		
		Vendedor vendedor = new Vendedor("Marcos", 1500.00);
		Administrativo administrativo = new Administrativo("Carla", 2300.00);
		RelatorioDescontos relatorio = new RelatorioDescontos();
		
		ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
		listaFuncionarios.add(vendedor);
		listaFuncionarios.add(administrativo);
		
		relatorio.imprimirListaDescontos3(listaFuncionarios);
	}
}
