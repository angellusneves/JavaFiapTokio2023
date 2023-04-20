package Aula05;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome da peca 1: ");
		String nomePeca1 = entrada.nextLine();
		
		System.out.print("Digite o numero de pecas 1: ");
		int numPecas1 = Integer.parseInt(entrada.nextLine());
		
		System.out.print("Digite o valor de pecas 1: ");
		double valorPeca1 = entrada.nextDouble();
		
		System.out.println(" ");
		
		System.out.println("Nome da peca 1: " + nomePeca1);
		System.out.println("Numero de pecas 1: " + numPecas1);
		System.out.println("Valor das pecas 1: " + valorPeca1);
		
		
		System.out.println(" ");
		
		Scanner entrada1 = new Scanner(System.in);
		
		System.out.print("Digite o nome da peca 2: ");
		String nomePeca2 = entrada1.nextLine();
		
		System.out.print("Digite o número de pecas 1: ");
		int numPecas2 = Integer.parseInt(entrada1.nextLine());
		
		System.out.print("Digite o valor de pecas 1: ");
		double valorPeca2 = entrada1.nextDouble();
		
        System.out.println(" ");
		
		System.out.println("Nome da peca 2: " + nomePeca2);
		System.out.println("Numero de pecas 2: " + numPecas2);
		System.out.println("Valor das pecas 2: " + valorPeca2);
		
		System.out.println(" ");
		 
		 double valorFinal2 = ((valorPeca1*numPecas1) + (valorPeca2*numPecas2));
		 System.out.println("Valor a ser pago " + valorFinal2);
		 
		 entrada.close();
		 entrada1.close();
		 
		 //Correta
	}

}
