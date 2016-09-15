package br.aulasjava.empresa;

import java.util.ArrayList;

public class RelatorioDescontos {

	public void imprimirListaDescontos(ArrayList<Funcionario> lista){

		for(int i=0; i<lista.size();i++){
			System.out.println("---------------");
			System.out.println(lista.get(i).getNome());
			System.out.println(lista.get(i).calcularDesconto());
			System.out.println("---------------");
		}
	}
	//A partir do Java 8
	public void imprimirListaDescontos2(ArrayList<Funcionario> lista){
		lista.forEach(Funcionario -> {
			System.out.println("---------------");
			System.out.println(Funcionario.getNome());
			System.out.println(Funcionario.calcularDesconto());
			System.out.println("---------------");
		});
	}
	
	//A partir do Java 1.5
	public void imprimirListaDescontos3(ArrayList<Funcionario> lista){
		for(Funcionario func: lista){
			System.out.println("---------------");
			System.out.println(func.getNome());
			System.out.println(func.calcularDesconto());
			System.out.println("---------------");
		}
	}
}
