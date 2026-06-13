package Lista4pack;

import java.util.Scanner;

public class Exercício19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		

	        int[][] matriz = new int[3][3];
	        boolean identidade = true;

	        System.out.println("Digite a matriz:");

	        for(int i = 0; i < 3; i++) {
	            for(int j = 0; j < 3; j++) {
	                matriz[i][j] = sc.nextInt();
	            }
	        }

	        for(int i = 0; i < 3; i++) {
	            for(int j = 0; j < 3; j++) {

	                if(i == j && matriz[i][j] != 1) {
	                    identidade = false;
	                }

	                if(i != j && matriz[i][j] != 0) {
	                    identidade = false;
	                }
	            }
	        }

	        if(identidade) {
	            System.out.println("A matriz é identidade.");
	        } else {
	            System.out.println("A matriz NÃO é identidade.");
	        }

	        sc.close();
	    }
	
		

	}


