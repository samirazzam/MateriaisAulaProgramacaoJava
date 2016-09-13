package br.aulajava.escola;

public class Aluno extends Pessoa{
	
	private String curso;
	private String notas[];
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aluno(String nome, String endereco, String cpf, String curso) {
		super(nome, endereco, cpf);
		this.curso = curso;
		
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String[] getNotas() {
		return notas;
	}
	public void setNotas(String[] notas) {
		this.notas = notas;
	}

	public double calcularMedia(){
		double somatorio = 0;
		for(int i = 0; i < notas.length; i++){
			somatorio += Double.parseDouble(notas[i]);
		}
		return somatorio/notas.length;
	}
	
	public void verificarAprovacao(){
		if (calcularMedia() >=7.0){
			System.out.println("Aluno aprovado!");
		}else{
			System.out.println("Aluno reprovado");
		}
	}
	
	@Override
	public String exibeDados(){
		String textoFormatado = "Aluno \n" +super.exibeDados()
				+"Média: " +this.calcularMedia() +"\n";
		return textoFormatado;
	}
	
}
