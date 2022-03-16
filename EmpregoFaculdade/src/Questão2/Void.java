package Questão2;
import java.util.Scanner;

public class Void {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		EmpregadoDaFaculdade empregado1 = new EmpregadoDaFaculdade("AAAA", 3000, 4);
		
		empregado1.getGastos();
		empregado1.getInfo();
		
		System.out.println(empregado1.getGastos());
		System.out.println(empregado1.getInfo());
	}

}
