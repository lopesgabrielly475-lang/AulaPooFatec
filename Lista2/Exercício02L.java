package Lista20;

import java.util.Scanner;

public class Exerc�cio02L {

	public static void main(String[] args) {		
     Scanner leitor = new Scanner ( System.in);
     
     System.out.println("Digite um numero inteiro: ");
          int numero = leitor.nextInt();
          
          if ( numero %2 == 0) {
        	  System.out.println("0 numero" + numero + " É PAR.");
          } else {
        	  System.out.println(" 0 numero " + numero + "É iMPAR.");
          }
     
             leitor.close();    
	}

}
