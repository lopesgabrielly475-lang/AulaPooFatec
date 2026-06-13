package Lista4pack;

import java.util.Scanner;

public class Exercício09 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		
		int[] numeros = new int[10];
		
		for(int i = 0; i< 10; i++) {
			numeros[i] = sc.nextInt();
		}
		
		for(int i = 0; i< 10; i++) {
			
			for(int j= i + 1; j < 10; j++) {
				
				if (numeros[i] > numeros [j]) {
					
					int temp = numeros[i];
					numeros[i] = numeros[j];
					           numeros[j] = temp;
				}
			}
		}
		
          System.out.println("Ordem cescente:  ");
          
          for(int n : numeros) {
        	  System.out.println(n);
          }
          
          sc.close();
	}

}
