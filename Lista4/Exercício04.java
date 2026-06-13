package Lista4pack;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double[] numeros = new double [6];
		double soma = 0;
		
		for (int i = 0;  i < 6; i++) {
			numeros[i] = sc.nextDouble();
			soma += numeros[i];
		}
		
		double media = soma / 6;
		
		System.out.println("Média = " + media);
		
		sc.close();

	}

}
