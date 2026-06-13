package Lista4pack;

import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[] numeros = new int[10];
		boolean encontrou = false;
		
		for(int i = 0; i < 10; i++) {
			numeros[i]= sc.nextInt();
		}
		
		System.out.println("Digite X: ");
		int x = sc.nextInt();
		
		for(int i = 0; i < 10; i++) {
			
			if(numeros[i] == x) {
				encontrou = true;
			}
		}
		
		if(encontrou) {
			System.out.println("X encontrado");
		} else {
			System.out.println("X não encontrado.");
		}
		
		sc.close();
	}
		
		 

}
