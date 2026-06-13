package Lista20;

import java.util.Scanner;

public class Exercício13 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Digite um ano: ");	
			int ano = sc.nextInt();
			
			if ((ano % 4 == 0 && ano % 100 != 0) ||
			(ano % 400 == 0)) {
				System.out.println("Bissexto");
			}else {
				System.out.println("Não é Bissexto");
			}
		}

		
	}

}
