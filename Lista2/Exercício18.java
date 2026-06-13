package Lista20;

import java.util.Scanner;

public class Exercício18 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner (System.in)) {
			boolean rodando = true;
			while (rodando) {
				System.out.println("1-Somar 2-Subtrair 3-Sair");
				int opcao = sc.nextInt();
				switch (opcao) {
				case 1:
			System.out.println("Somando...");
			break;
			    
				case 2:
					System.out.println("Subtraindo...");
					break;
					
				case 3: rodando = false; break; 
				default:
			System.out.println("Opção inválida");
					
					
				}
			}
		}

	}

}
