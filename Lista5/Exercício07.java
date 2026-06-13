package Lista05gabi;

import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {
		
		System.out.println("--- Todos os Números ---");
        mostrarNumeros();
        
        System.out.println("\n--- Apenas Pares ---");
        mostrarPares();
        
        System.out.println("\n--- Apenas Ímpares ---");
        mostrarImpares();
    }

    public static void mostrarNumeros() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void mostrarPares() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void mostrarImpares() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

		

	}


