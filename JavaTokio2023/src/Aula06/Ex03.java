package Aula06;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a primeiro nota: ");
		int nota1 = entrada.nextInt();
		
		System.out.print("Digite a segunda nota: ");
		int nota2 = entrada.nextInt();
		
		System.out.print("Digite a terceira nota: ");
		int nota3 = entrada.nextInt();
		
		System.out.print("Digite a quarta nota: ");
		int nota4 = entrada.nextInt();
		
		int media = (nota1 + nota2 + nota3 + nota4)/4;
		 
		if (media < 5) {
		System.out.println("Reprovado");
		} else {
		if (media <= 6) {
		System.out.println("Recuperacao");
		}
		else {
		System.out.println("Aprovado");
		}
		}

	}

}
         //correta