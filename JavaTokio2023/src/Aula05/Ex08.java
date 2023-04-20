package Aula05;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor em R$ para conversao: ");
		double valorReal = entrada.nextDouble();
		
		System.out.println(" ");
		
		double dolar = 5.04;
		double euro = 5.53;
		double argentino = 0.023;
		double esterlino = 6.28;
		double iene = 0.038;
		
		double conversaoDolar = (valorReal*dolar);
		System.out.println("Conversao dolar: " + conversaoDolar);
		
		double conversaoEuro = (valorReal*euro);
		System.out.print("Conversao Euro: " + conversaoEuro);
		
		double conversaoArgentino = (valorReal*argentino);
		System.out.println("Conversao Peso Argentino: " + conversaoArgentino);
		
		double conversaoEsterlino = (valorReal*esterlino);
		System.out.println("Conversao Esterlino: " + conversaoEsterlino);
		
		double conversaoIene = (valorReal*iene);
		System.out.println("Conversao Iene: " + conversaoIene);
		
		//Falta colocar em 2 casas decimais 

	}

}
