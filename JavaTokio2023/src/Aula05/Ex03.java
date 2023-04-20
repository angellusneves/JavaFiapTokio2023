package Aula05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Digite seu nome:");
	    String nome = entrada.nextLine();
	    
	    System.out.println("Selecione seu genero:");
	    System.out.println("[M] - Masculino");
	    System.out.println("[F] - Feminino");
	    System.out.println("[O] - Outrp");
	    System.out.println("[N] - Não Responder");
	    
	    char genero = entrada.nextLine().charAt(0);
	    
	    System.out.println("Olá, " + nome + "! " + "Você escolheu a seguinte opção de gênero: " + genero);
	    
	    entrada.close();
	    
	   //Correta 
	}

}
