package Aula05;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex11 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua idade (anos): ");
		int anos = sc.nextInt();
		
		System.out.print("Digite sua idade (meses): ");
		int meses = sc.nextInt();
		
		System.out.print("Digite sua idade (dias): ");
		int dias = sc.nextInt();
		
		anos = anos / 365;
		meses = meses / 30;
		
		dias = dias + meses + anos;
		
		System.out.printf("Total de dias vividos: %d" + "\nMeses: %d" + "\nAnos: %d", dias, meses, anos);
		
		

	}

}
