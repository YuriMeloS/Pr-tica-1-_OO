package Questão2;

public class EmpregadoDaFaculdade {
	private String nome;
	private double salario;
	private int horasAula;
	private double salarioUpdated;
	
	double getGastos() {
		//return this.salario + (this.horasAula*40);
		return this.salarioUpdated = (this.salario+this.horasAula*40);
	}
	
	String getInfo() {
		return "nome: " + this.nome + "com salário" + this.salarioUpdated;
	}
}
