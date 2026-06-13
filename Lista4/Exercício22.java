package Lista4pack;

import java.util.Scanner;

public class Exercício22 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        int[][] matriz = new int[3][3];
	        boolean repetido = false;

	        for(int i = 0; i < 3; i++) {
	            for(int j = 0; j < 3; j++) {
	                matriz[i][j] = sc.nextInt();
	            }
	        }

	        for(int i = 0; i < 3; i++) {
	            for(int j = 0; j < 3; j++) {

	                for(int k = 0; k < 3; k++) {
	                    for(int l = 0; l < 3; l++) {

	                        if((i != k || j != l)
	                                && matriz[i][j] == matriz[k][l]) {
	                            repetido = true;
	                        }
	                    }
	                }
	            }
	        }

	        if(repetido) {
	            System.out.println("Existem números repetidos.");
	        } else {
	            System.out.println("Não existem números repetidos.");
	        }

	        sc.close();
	    }
	

	}


