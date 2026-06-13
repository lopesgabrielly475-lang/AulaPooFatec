package Lista003;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		
		Scanner leitor =  new Scanner (System.in);
		
		int maior = Integer.MIN_VALUE;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite o "+ i + "°número: ");
			int num = leitor.nextInt();
			if (num > maior) {
				maior = num;
			}
		}
		System.out.println("O maior número digitado foi: " + maior);
		           leitor.close();
		
	}

}
