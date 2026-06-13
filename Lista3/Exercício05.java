package Lista003;

import java.util.Scanner;

public class Exerc�cio05 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		System.out.println( "Digite um número para ver a tabuada: ");
		          int num = leitor.nextInt();
		          
		          for ( int i = 1; i<= 10; i++) {
		        	  System.out.println(num + "x" + i + "=" + (num * i));
		          }
		           leitor.close();
		
		

	}

}
