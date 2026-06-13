package Lista003;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		int num;
		int somaTotal = 0;
		
		do {
			System.out.println("Digite um número (ou 0 para sair): ");
			num = leitor.nextInt();
			somaTotal += num;
		 } while (num != 0);
		
		System.out.println("A soma total é: " + somaTotal);
		leitor.close();

	}

}
