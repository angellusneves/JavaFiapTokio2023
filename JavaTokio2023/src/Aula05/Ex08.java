package Aula05;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Digite o valor em R$ para conversao: ");
			double valorReal = entrada.nextDouble();
			
			System.out.println(" ");
			
			double dolar = 5.04;
			double euro = 5.53;
			double argentino = 0.023;
			double esterlino = 6.28;
			double iene = 0.038;
			
			double conversaoDolar = (valorReal*dolar);
			System.out.printf("Conversao dolar: %.2f %n ", conversaoDolar);
			
			double conversaoEuro = (valorReal*euro);
			System.out.printf("Conversao Euro: %.2f %n", conversaoEuro);
			
			double conversaoArgentino = (valorReal*argentino);
			System.out.printf("Conversao Peso Argentino: %.2f %n", conversaoArgentino);
			
			double conversaoEsterlino = (valorReal*esterlino);
			System.out.printf("Conversao Esterlino: %.2f %n", conversaoEsterlino);
			
			double conversaoIene = (valorReal*iene);
			System.out.printf("Conversao Iene: %.2f %n", conversaoIene);
		}
		
		//Correta 

	}

}
