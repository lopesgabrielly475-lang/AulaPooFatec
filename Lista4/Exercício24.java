package Lista4pack;

import java.util.Scanner;

public class Exercício24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite o número procurado: ");
        int numero = sc.nextInt();

        boolean encontrou = false;

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {

                if(matriz[i][j] == numero) {
                    System.out.println("Encontrado na linha "
                            + i + " coluna " + j);
                    encontrou = true;
                }
            }
        }

        if(!encontrou) {
            System.out.println("Número não encontrado.");
        }

        sc.close();
    }


	}


