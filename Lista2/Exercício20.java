package Lista20;

import java.util.Scanner;

public class Exercício20 {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
       
        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }
        
        
        scanner.close();
    }

	}

	}

}
