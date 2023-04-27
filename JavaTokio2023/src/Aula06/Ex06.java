package Aula06;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if (idade < 16 || idade >= 70) {
			System.out.println("O voto e proibido");
		} else if (idade >= 16 && idade < 18) {
			System.out.println("O voto e opcional");
		} else if (idade >= 18 && idade < 70) {
			System.out.println("O voto e obrigatorio");
		}
			}
		}

	


