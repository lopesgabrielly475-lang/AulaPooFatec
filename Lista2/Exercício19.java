package Lista20;

import java.util.Scanner;

public class Exercício19 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Temperatura: ");
			double temp = sc.nextDouble();
			if (temp < 15)
				System.out.println("frio");
			else if (temp <= 25)
			System.out.println("Agradável");
			else System.out.println("Quente");
		}
   
	}

}
