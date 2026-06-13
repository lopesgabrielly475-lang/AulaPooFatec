package Lista003;

import java.util.Scanner;

public class Exercício12 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		int opcao = 0;
		
		while (opcao != 3) {
			System.out.println("\n---MENU INTERATIVO ---");
			           System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - sair");
			System.out.println("Escolha uma opção: ");
			opcao = leitor.nextInt();
			
			if (opcao == 1 || opcao == 2) {
				
				System.out.println("Digite o primeiro valor: ");
				       
				         int v1 =
				      leitor.nextInt();
				         
				         System.out.println("Digite o segundo valor: ");
				          
				          int v2 =
				       leitor.nextInt();
				          
				          if (opcao == 1) {
				        	  
				        	  System.out.println("Resultado da soma: " + (v1 + v2));
				          } else {
				        	  System.out.println("Resultado da subtração: " + (v1 - v2));
				          }
				          
			} else if (opcao != 3) {
				
				System.out.println("opcao inválida.");
			}
			
		}
		System.out.println("Saindo do programa...");
		leitor.close();
			}
			
		

	}


