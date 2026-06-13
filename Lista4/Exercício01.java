package Lista4pack;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in);
		
		int[] numeros = new int [5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número: ");
			numeros [i] = sc.nextInt();
		}
		
		System.out.println("Números digitados: ");
		
		for (int i = 0; i < 5; i ++) {
			
			System.out.println(numeros[i]);
		       }
		
		sc.close();
		

	}

}
