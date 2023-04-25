package Aula06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	    System.out.print("Informe um valor inteiro: ");
	    int num = entrada.nextInt();

	    if(num % 2 == 0){
	      System.out.print("Voce informou um numero par");
	    }
	    else{
	      System.out.print("Voce informou um numero impar");
	    }
	    
	    System.exit(0);
	  }
	}
		//correta
