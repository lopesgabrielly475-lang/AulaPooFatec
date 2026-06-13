package Lista003;

import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		  int positivos = 0;
		  int negativos = 0;
		  
		  for (int i = 1; i <= 10; i++) {
			  System.out.println("Digite um número: ");
			  
			  int num = leitor.nextInt();
			  if (num > 0) {
				  positivos++;
			  }  else if (num < 0) {
				  negativos++;
			  }
			  System.out.println("Total de positivos: " + positivos);
			  System.out.println("Total de negativos: " + negativos);
			  
			  leitor.close();
		  }

	}

}
