package Package2;

import java.util.Scanner;

public class Exercício21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double saldo = 0.0;
		boolean autenticado = false;

		
		System.out.println("=== BEM-VINDO AO SISTEMA BANCÁRIO ===");
		System.out.print("Digite o usuário: ");
		String user = sc.nextLine();
		System.out.print("Digite a senha: ");
		String pass = sc.nextLine();

		if (user.equals("admin") && pass.equals("1234")) {
		    autenticado = true;
		    System.out.println("Login efetuado com sucesso!");
		} else {
		    System.out.println("Usuário ou senha incorretos. Encerrando sistema.");
		}

		
		while (autenticado) {
		    System.out.println("\n--- MENU BANCÁRIO ---");
		    System.out.println("1 - Ver Saldo");
		    System.out.println("2 - Depositar");
		    System.out.println("3 - Sacar");
		    System.out.println("4 - Sair");
		    System.out.print("Escolha uma opção: ");
		    int opcao = sc.nextInt();

		    switch (opcao) {
		        case 1:
		            System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
		            break;
		            
		        case 2:
		            System.out.print("Digite o valor para depósito: R$ ");
		            double deposito = sc.nextDouble();
		            if (deposito > 0) {
		                saldo += deposito;
		                System.out.println("Depósito realizado com sucesso!");
		            } else {
		                System.out.println("Valor inválido para depósito.");
		            }
		            break;
		            
		        case 3:
		            System.out.print("Digite o valor para saque: R$ ");
		            double saque = sc.nextDouble();
		            if (saque > saldo) {
		                System.out.println("Erro: Saldo insuficiente para realizar a operação.");
		            } else if (saque <= 0) {
		                System.out.println("Valor inválido para saque.");
		            } else {
		                saldo -= saque;
		                System.out.println("Saque realizado com sucesso!");
		            }
		            break;
		            
		        case 4:
		            System.out.println("Obrigado por usar nosso sistema bancário. Até logo!");
		            autenticado = false;
		            break;
		            
		        default:
		            System.out.println("Opção inválida! Tente novamente.");
		    }
		}
		

	}

}
