package Aula09;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] numeros = {10, 20, 5, 3};
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Pos: %d -- Valor %d\n", i, numeros[i]);
		}
		
		for (int num: numeros) {
			System.out.println(num);
			if (num != 20) {
				System.out.println(num);
			}
			
		}

	}

}
