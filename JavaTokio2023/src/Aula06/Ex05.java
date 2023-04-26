package Aula06;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    
	    String num1, num2;
	    
	    System.out.print("Digite o primeiro numero: ");
		num1 = sc.nextLine();
		
		
		System.out.print("Digite o segundo numero: ");
		num2 = sc.nextLine();
		
		System.out.println("Escolha uma operacao: ");
		String num3 = sc.nextLine();
		
		
		
		switch (num3) {
		case "+":
			System.out.println("A soma dos numeros e: " + (num1 + num2));
			break;
		case "-":
			
			
		}
	    }
	  
	}


