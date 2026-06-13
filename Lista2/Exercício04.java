package Lista20;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
       try (Scanner sc = new  Scanner( System.in)) {
		System.out.println("Digite um número: ");
		           int n1 = sc.nextInt();
		           
		           System.out.println("Digite um número: ");
		           int n2 = sc.nextInt();
   
		           
				if ( n1 >= n2 ) {
					System.out.println( n1 + " Maior que " + n2 );
					 
					 if ( n1 <= n2) {
						 System.out.println( n1 + " Menor que " + n2 );		 
						 
						 
						 
					 }
		        	   
		           }
	}
               
               
       
	}

}
