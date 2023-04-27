package Aula06;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
            
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a distancia percorrida (km): ");
		double distancia = sc.nextDouble();
		
		System.out.print("Digite a quant. de combustivel gasto (lt): ");
		double combustivel = sc.nextDouble();
		
		double consumo = distancia / combustivel;
		
		if (consumo < 8) {
			System.out.println("Esse carro bebe hein!");
		} else {
			System.out.println("Autonomia legal");
		}
	}

}
