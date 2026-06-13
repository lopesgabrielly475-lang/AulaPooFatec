package Lista4pack;

import java.util.Scanner;

public class Exercício13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[][] matriz = new int [3][3];
		int soma = 0;
		
		for(int i =0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for(int i =0; i < 3; i++) {
			soma += matriz[i][i];
		}
		
		System.out.println("Soma diagonal =  " + soma);
		
		sc.close();
		

	}

}
