package Lista05gabi;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		int numero = lernumero();
		boolean resultadoPar = ehPar (numero);
		mostrarResultado(numero, resultadoPar);
	}
	
	public static int lernumero() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite um número inteiro: ");
		return scanner.nextInt();
	}

	public static boolean ehPar(int numero) {
		return numero % 2 == 0;	
	}
	
	public static void mostrarResultado(int numero, boolean par) {
		if (par) {
			
			System.out.println("O número " + numero + " é PAR");
		}else {
			
			System.out.println("O número " + numero + " é IMPAR");
		}
				
	}
}
