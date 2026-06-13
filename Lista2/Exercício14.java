package Lista20;

import java.util.Scanner;

public class Exercício14 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Lados A, B, C: ");
			int la = sc.nextInt(), lb = sc.nextInt(), lc = sc.nextInt();
			
			if (la + lb > lc && la + lc > lb && lb + lc > la) {
				if (la == lb && lb == lc)
			System.out.println("Equilátero");
				else if (la == lb || lb == lc || la == lc) 
					System.out.println(" Isósceles");
				else
			System.out.println("Escaleno");	
			}else {
				System.out.println("Não forma um triângulo");
			}
		}
		
		

	}

}
