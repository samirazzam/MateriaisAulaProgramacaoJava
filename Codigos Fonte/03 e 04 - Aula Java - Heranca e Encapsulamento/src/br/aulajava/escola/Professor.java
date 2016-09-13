package br.aulajava.escola;

public class Professor extends Pessoa{

	private String depto;
	private double salario;
	
	
	
	public Professor() {
		super();
	}

	public Professor(String nome, String endereco, String cpf, String dpto) {
		super(nome, endereco, cpf);
		this.depto = dpto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}
	
	public String getDepto() {
		return depto;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public double calcularSalarioLiquido(){
		return this.salario*0.9;
	}
	
	@Override
	public String exibeDados(){
		String textoFormatado = "Professor \n" +super.exibeDados()
				+"Departamento: " +this.getDepto() +"\n"
				+"Salário líquido R$" +this.calcularSalarioLiquido();
		return textoFormatado;
	}
}
