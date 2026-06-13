package Lista4pack;

import java.util.Scanner;

public class Exercício23 {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);

	        int[][] matriz = new int[3][3];
	        int[][] rotacionada = new int[3][3];

	        for(int i = 0; i < 3; i++) {
	            for(int j = 0; j < 3; j++) {
	                matriz[i][j] = sc.nextInt();
	            }
	        }

	        for(int i = 0; i < 3; i++) {
	            for(int j = 0; j < 3; j++) {
	                rotacionada[j][2 - i] = matriz[i][j];
	            }
	        }

	        System.out.println("Matriz rotacionada:");

	        for(int i = 0; i < 3; i++) {
	            for(int j = 0; j < 3; j++) {
	                System.out.print(rotacionada[i][j] + " ");
	            }
	            System.out.println();
	        }

	        sc.close();
	

	}

}
