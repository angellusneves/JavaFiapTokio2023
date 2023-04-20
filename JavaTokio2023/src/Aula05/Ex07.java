package Aula05;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		double valorProduto = entrada.nextDouble();
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Digite a quantia paga pelo produto: ");
		double precoProduto = entrada1.nextDouble();
		
		double troco = (precoProduto - valorProduto );
		System.out.println("Seu troco e: " + troco);
		
		//Correta

	}

}
