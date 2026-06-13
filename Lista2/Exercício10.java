package Lista20;

import java.util.Scanner;

public class Exercício10 {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner (System.in);

		System.out.println("Valor da compra: "); double valor = sc.nextDouble();
		
		if (valor >= 100) {
			valor -= valor * 0.10;
		}
		System.out.println("Valor final: R$" + valor);
	}

}
