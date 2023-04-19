package revisao;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		//Peça 1
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome da peça 1: ");
		String nomePeca1 = entrada.nextLine();
		
		System.out.print("Digite o número de peças 1: ");
		int numPecas1 = Integer.parseInt(entrada.nextLine());
		
		System.out.print("Digite o valor de peças 1: ");
		double valorPeca1 = entrada.nextDouble();
		
		System.out.println(" ");
		
		System.out.println("Nome da peça 1: " + nomePeca1);
		System.out.println("Número de peças 1: " + numPecas1);
		System.out.println("Valor das peças 1: " + valorPeca1);
		
		
		System.out.println(" ");
		
		Scanner entrada2 = new Scanner(System.in);
		
		System.out.print("Digite o nome da peça 2: ");
		String nomePeca2 = entrada.nextLine();
		
		System.out.print("Digite o número de peças 1: ");
		int numPecas2 = Integer.parseInt(entrada.nextLine());
		
		System.out.print("Digite o valor de peças 1: ");
		double valorPeca2 = entrada.nextDouble();
		
        System.out.println(" ");
		
		System.out.println("Nome da peça 2: " + nomePeca2);
		System.out.println("Número de peças 2: " + numPecas2);
		System.out.println("Valor das peças 2: " + valorPeca2);
		
	}

}
