package Lista4pack;

import java.util.Scanner;

public class Exercício15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[][] matriz = new int [3][3];
		int pares = 0;
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				matriz[i][j] = sc.nextInt();
				
				if(matriz[i][j] % 2 == 0) {
					pares++;
				}
			}
		}
		
		System.out.println("Pares = " + pares);
		
		sc.close();

	}

}
