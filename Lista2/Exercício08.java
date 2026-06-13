package Lista20;

import java.util.Scanner;

public class Exercício08 {

	public static void main(String[] args) {
    try (Scanner sc = new Scanner (System.in)) {
		System.out.println("N1: "); int a = 
				sc.nextInt();
		System.out.println("N2: "); int b = 
				sc.nextInt();
		System.out.println("N3: "); int c = 
				sc.nextInt();
		
		int maior = a;
		if (b > maior) maior = b;
		if(c > maior) maior = c;
		System.out.println("O maior é: " + maior);
	}
    
    
	}

}
