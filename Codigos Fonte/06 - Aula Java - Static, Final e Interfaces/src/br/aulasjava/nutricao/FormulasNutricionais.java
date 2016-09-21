package br.aulasjava.nutricao;

public abstract class FormulasNutricionais {

	/* Método para cálculo do Metabolismo Basal (MB),
	 * simplificado, pois varia para homens e mulheres
	 * assim como com a idade
	 */
	public static double metabolismoBasal(Paciente p){
		double mb = 0.0;
		//Usando o if / else if para mostrar mais uma estrutura
		if (p.getIdade() >= 10 && p.getIdade()<18){
			mb = 16.6*p.getPeso()+77*p.getAltura()+572;
		}else if (p.getIdade()>=18 && p.getIdade()<30) {
			mb = 15.4*p.getPeso()+27*p.getAltura()+717;
		}else if (p.getIdade()>=30 && p.getIdade()<60) {
			mb = 11.3*p.getPeso()+16*p.getAltura()+901;
		}else if (p.getIdade()>=60){
			mb = 8.8*p.getPeso()+1.128*p.getAltura()-1071;
		}
		return mb;
	}
	
	public static double valorEnergeticoTotal(Paciente p, int nivelAtividade){
		/*Nível de atividade: 
		 * 1 = Leve
		 * 2 = Moderada
		 * 3 = Intensa
		 */
		double vet = 0.0;
		if (nivelAtividade == 1){
			vet = metabolismoBasal(p) * ConstantesNutricao.coefAtividadeLeve;
		}else if (nivelAtividade == 2){
			vet = metabolismoBasal(p) * ConstantesNutricao.coefAtividadeModerado;
		}else if (nivelAtividade == 3){
			vet = metabolismoBasal(p) * ConstantesNutricao.coefAtividadeIntenso;
		}
		return vet;
	}
	
	public static void resumoNutricional(Paciente p, int nivelAtividade){
		System.out.println("Nome do paciente: " +p.getNome());
		System.out.println("Idade do paciente: " +p.getIdade() +" anos");
		System.out.println("Altura do paciente: " +p.getAltura() +"cm");
		System.out.println("Peso do paciente: " +p.getPeso() +"kg");
		System.out.println("Taxa de Metabolismo Basal (MB): " +String.format("%.2f", metabolismoBasal(p)));
		System.out.println("Valor Energético Total (VET):" +String.format("%.2f", valorEnergeticoTotal(p,nivelAtividade)));
	}
}
