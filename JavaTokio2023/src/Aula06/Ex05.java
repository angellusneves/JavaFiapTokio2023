package Aula06;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
	    Scanner numeros = new Scanner(System.in);
	    Scanner operadores = new Scanner(System.in);
	    
	    int num1; 
	    int num2;
	    
	    System.out.print("Digite o primeiro numero: ");
		num1 = numeros.nextInt();
		
		
		System.out.print("Digite o segundo numero: ");
		num2 = numeros.nextInt();
		
		System.out.print("Escolha uma operacao: ");
		String opr = operadores.nextLine();
		
		switch (opr) {
		case "+":
			System.out.println("A soma dos numeros e: " + (num1 + num2));
			break;
		case "-":
			System.out.println("A subtracao dos numeros e: " + (num1 - num2));
			break;
		case "*":
			System.out.println("A multiplicacao dos numeros e: " + (num1 * num2));
			break;
		case "/":
			System.out.println("A soma dos numeros e: " + (num1 / num2));
			break;
			
		}
		
		
		
		
			
		
	    }
	  
	}


