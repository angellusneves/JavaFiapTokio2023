package Aula05;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		System.out.println("Ola, queremos saber quantos dias você viveu ate o momento");
		
		Scanner entradaAnos = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		double Idade = entradaAnos.nextDouble();
		
		System.out.print("Digite o mes do seu aniversario: ");
		double Meses = entradaAnos.nextDouble();
		
		System.out.print("Digite o dia do seu aniversario: ");
		double Dias = entradaAnos.nextDouble();
		
		Idade = 365;
		Meses = 30;
		Dias = 1;
		
		System.out.println(Idade + Meses + Dias);
		
		//Errada
		 
	}

}
