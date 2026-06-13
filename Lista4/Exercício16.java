package Lista4pack;

import java.util.Scanner;

public class Exercício16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[][] matriz = new int [3][3];
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				sc.nextInt();
			}
		}
		
		System.out.println("Transposta: ");
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				System.out.println(matriz[j][i] + " ");
			}
			
			System.out.println();
		}
		
          sc.close();
	}

}
