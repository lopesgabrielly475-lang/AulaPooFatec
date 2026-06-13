package Lista4pack;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[] numeros = new int[10];
		int pares = 0;
		
		for(int i= 0; i < 10; i++) {
			
			numeros[i] = sc.nextInt();
			
			if(numeros [i] % 2 == 0) {
		}
		
	}
		
		System.out.println("Quantiade de pares = " + pares);
		
		       sc.close();
		       
	}
	
}
