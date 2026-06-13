package Lista4pack;

import java.util.Scanner;

public class Exercício17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[][] matriz = new int [3][3];
		
		System.out.println("Digite os elementos da matriz: ");
		
		for(int i = 0; i < 3; i++) {
			for(int j =0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite o número multiplicador: ");
		 int numero = sc.nextInt();
		 
		 System.out.println("Matriz Resultante ");
		 
		 for(int i = 0; i < 3; i++) {
			 for(int j = 0; j< 3; j++) {
				 
				 System.out.println(( matriz[i][j] * numero)+ " ");
			 }
			 
			 System.out.println();
		 }
		
		sc.close();

	}

}
