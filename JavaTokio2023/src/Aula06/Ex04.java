package Aula06;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor A: ");
		int ValorA = entrada.nextInt();
		
		System.out.print("Digite o valor B: ");
		int ValorB = entrada.nextInt();
		
		if((ValorA%ValorB == 0) || (ValorA%ValorB == 0)){
		      System.out.print("Sao multiplos");
		    }
		    else{
		      System.out.print("Nao sao multiplos");
		    }

	}

}
