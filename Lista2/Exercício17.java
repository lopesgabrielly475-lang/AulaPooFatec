package Lista20;

import java.util.Scanner;

public class Exercício17 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner (System.in)) {
			int tentativas = 0;
			while (tentativas < 3){
				System.out.println("Senha: ");
				String s = sc.next();
				if (s.equals("1234")) {
					System.out.println("Acesso liberado");
					break;
					
				}
				tentativas++;
				if (tentativas == 3)
					System.out.println("Conta bloqueada");
			}
		}

	}

}
