package Lista20;

import java.util.Scanner;

public class Exercício16 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Valor: ");
			int saque = sc.nextInt() ;
			
			int [] notas = {100, 50, 20, 10, 5, 2, 1};
			
			for (int nota : notas) {
				int qtd = saque / nota;
			if (qtd > 0) {
				
				System.out.println(qtd + " nota(s) de R$" + nota);
				       saque %= nota;
			}
			}
		}

	}

}
