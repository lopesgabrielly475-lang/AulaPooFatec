package Lista4pack;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[] numeros = new int [10];
		
		for(int i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();
		}
		
		System.out.println("Valores únicos: ");
		
		for(int i = 0; i < 10; i++) {
			
			boolean repetido = false;
			
			for(int j = 0; j < i; j++) {
				
				if(numeros[i] == numeros[j]) {
			}
		}
			
			if(!repetido) {
				
				System.out.println(numeros[i]);
			}
	}
		
		sc.close();

}
	
}
