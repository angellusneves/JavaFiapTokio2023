package Aula06;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		int num1 = entrada.nextInt();
		System.out.print("Digite o segundo numero: ");
		int num2 = entrada.nextInt();
		
		System.out.println("");

	    if(num1 == num2){
	      System.out.print("Os numeros sao iguais");
	    }
	    else {
	      if (num1 > num2) {
	      System.out.print("Primeiro numero e maior: " + num1);
	      }
	      else {
	    	  System.out.print("Segundo numero e maior: " + num2);
	      }
	    }
	} 

}
        //correta
