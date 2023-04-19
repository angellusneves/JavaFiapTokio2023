package revisao;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor A");
		double A = entrada.nextDouble();
		
		System.out.println("Digite o valor B");
		double B = entrada.nextDouble();
		
		System.out.println(((A*4)+(B*6))/2);
		
		entrada.close();

	}

}
