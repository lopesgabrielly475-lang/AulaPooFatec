package Lista20;

import java.util.Scanner;

public class Exerc�cio05 {

	public static void main(String[] args) {
        try (Scanner entrada = new Scanner (System.in)) {
			System.out.println("Informe um número inteiro: ");
			            int numero = entrada.nextInt();
			            
			            if (numero >= 10 && numero <= 50) {
			            	
			            	System.out.println(" O número " + numero + " Está Dentro do intervalo");
			            } else {
			            	
			            	System.out.println(" O número "+ numero + " Está fora do intervalo");
			            }
		}
	}

}
