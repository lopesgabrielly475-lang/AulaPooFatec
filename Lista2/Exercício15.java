package Lista20;

import java.util.Scanner;

public class Exercício15 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Peso (Kg): ");
			double p = sc.nextDouble();
			System.out.println("Altura(m): ");
			double h = sc.nextDouble();
			double imc = p / (h * h);
			
			if (imc < 18.5)
				System.out.println("Abaixo do peso");
			else if (imc <= 24.9)
System.out.println("Normal");
			else if (imc <= 29.9)
			System.out.println("Sobrepeso");
			else System.out.println("Obesidade");
		}
		

		
	}

}
