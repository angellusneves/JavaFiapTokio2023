package Aula05;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor A");
		double A = entrada.nextDouble();
		
		System.out.println("Digite o valor B");
		double B = entrada.nextDouble();
		
		System.out.println((A + B)/2);
		
		entrada.close();
		
		//Correta

	}

}
