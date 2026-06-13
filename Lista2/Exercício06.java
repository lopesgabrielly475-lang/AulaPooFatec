package Lista20;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) { 
		
		try (Scanner numero = new Scanner (System.in)) {
			System.out.println("Digite a idade: ");
			       int idadeCat = numero.nextInt();
			       
			       if (idadeCat <= 12)
			    	   System.out.println("Criança");
			       else if ( idadeCat <= 17)
			    	   System.out.println("Adolescente");
			       else if (idadeCat <= 59)
			    	   System.out.println("Adulto");
			       else System.out.println("idoso");
		}
	}

}
