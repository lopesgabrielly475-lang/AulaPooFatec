package Lista4pack;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[] numeros = new int[5];
		
		for(int i = 0; i < 5; i++) {
			numeros [i] = sc.nextInt();
		}
		
		System.out.println("Ordem inversa: ");
		
		for(int i = 4; i >=0; i --) {
			
	System.out.println(numeros[i]);
		}
		
		sc.close();

	}

}
