package Lista20;

import java.util.Scanner;

public class Exerc�cio11 {
	
	public static void main(String[] args, char op) {
		
		  try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Número 1:  ");
			double d1 = sc.nextDouble();
			System.out.println("Número 2: ");
			double d2 = sc.nextDouble();
			System.out.println("operação: (+, -, *, /): ");
			
			sc.next().charAt(0); 
			
			switch (op) {
				case '+':
			System.out.println("Resultado: " + (d1 + d2)); break;
				case '-':
			System.out.println("Resultado: " + (d1 - d2)); break;
				case '*':
			System.out.println("Resultado: " + (d1 * d2)); break;
				case '/':
					if (d2 != 0)
			System.out.println("Resultado: " + ( d1 / d2));
			else System.out.println("Erro: Divisão por zero");
					break;
		default: System.out.println("Operação inválida");
				
			}
		}
		}

	}


