package Lista003;

import java.util.Scanner;

public class Exercício11 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		int num;
		
		do {
			System.out.println("Peça um número entre 1 e 10: ");
			num= leitor.nextInt();
			if (num < 1 || num > 10) {
				
				System.out.println("Número Inválido! Tente novamente");
			}
		} while (num < 1  || num > 10 );
		
		System.out.println("Você digitou o número válido: " + num );
		leitor.close();

	}

}
