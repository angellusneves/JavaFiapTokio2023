package Aula05;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		double num = entrada.nextDouble();
		
		double centenas = num / 100;
		double dezenas = (num%100) / 10;
		double unidades = ((num%100)%10);
		
	
		int centenasInt = (int)centenas;
		int dezenasInt = (int)dezenas;
		int unidadesInt = (int)unidades;
		
		System.out.println("");
		
		System.out.println("Centena = " + centenasInt+"00");
		System.out.println("Dezena = " + dezenasInt+"0");
		System.out.println("Unidades = " + unidadesInt);
		
		
		//correta
		
		
		
	

	}

}
