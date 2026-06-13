package Lista4pack;

import java.util.Scanner;

public class Exercício08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[] numeros = new int[10];
		int contador = 0;
		
		for(int i = 0; i < 10; i++) {
		}
		
		int x = sc.nextInt();
		
		for(int i = 0; i < 10; i++) {
			
			if(numeros [i] ==x) {
				contador++;
			}
		}
		
		System.out.println("Quantidade = " + contador);
		
		sc.close();

	}

}
