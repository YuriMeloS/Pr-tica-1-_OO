package Quest�o2;

public class EmpregadoDaFaculdade {
	private String nome;
	private double salario;
	private int horasAula;
	private double salarioUpdated;
	
	
	
	
	public EmpregadoDaFaculdade(String nome, double salario, int horasAula) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.horasAula = horasAula;

	}

	double getGastos() {
		//return this.salario + (this.horasAula*40);
		return this.salarioUpdated = (this.salario+this.horasAula*40);
	}
	
	String getInfo() {
		return "nome: " + this.nome + " com sal�rio " + this.salarioUpdated;
	}
}
