package Lista20;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       
       System.out.println("Digite a idade da pessoa: ");
                  int idade = teclado.nextInt();
                  
                  if (idade >= 18) {
                	  
                System.out.println("Resultado: Maior de idade.");
                  } else {
                	  
           System.out.println("Resultado: Menor de idade.");     	  
                  }
                  
                  teclado.close();
	}

}
