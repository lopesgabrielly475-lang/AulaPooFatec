package Lista003;

import java.util.Scanner;

public class Exercício09 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite um número positivo: ");
		int n = leitor.nextInt();
		long fatorial = 1;
		
		for ( int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		System.out.println("O fatorial de " + n + " é: " + fatorial);
		leitor.close();
		
	}

}
