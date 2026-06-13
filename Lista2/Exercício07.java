package Lista20;

import java.util.Scanner;

public class Exerc�cio07 {

	private static Scanner sc;

	public static void main(String[] args) {
     sc = new Scanner ( System.in);
     
     System.out.println( " Nota 1: ");
     
     double nota1 = sc.nextDouble();
     
     System.out.println(" Nota 2: ");
     
     double nota2 = sc.nextDouble();
     
     double media = (nota1 + nota2) / 2;
     
     if (media >= 6)
    	 System.out.println("Aprovado");
     
     else if (media >= 4)
    	 
    	
    	 System.out.println("Recuperação");
     
     else System.out.println("Reprovado");
     
	}

}
