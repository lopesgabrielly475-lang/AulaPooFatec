package Lista4pack;

import java.util.Scanner;

public class Exercício18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] soma = new int[3][3];

        System.out.println("Digite a primeira matriz:");

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matriz1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite a segunda matriz:");

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matriz2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz soma:");

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

		

	}


