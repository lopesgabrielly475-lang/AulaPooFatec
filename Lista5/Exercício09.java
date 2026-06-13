package Lista05gabi;

import java.util.Scanner;



public class Exercício09 {
	
	private static double saldo = 0.0; // Variável global para manter o estado do saldo de forma simples

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            mostrarMenu();
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> consultarSaldo();
                case 2 -> depositar();
                case 3 -> sacar();
                case 4 -> System.out.println("Saindo do sistema bancário.");
                default -> System.out.println("Opção inválida.");
            }
            System.out.println();
        } while (opcao != 4);
    }

    public static void mostrarMenu() {
        System.out.println("--- BANCO DIGITAL ---");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Sair");
    }

    public static void consultarSaldo() {
        System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
    }

    public static void depositar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do depósito: R$ ");
        double valor = scanner.nextDouble();
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public static void sacar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do saque: R$ ");
        double valor = scanner.nextDouble();
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saque negado. Saldo insuficiente ou valor inválido.");
        }
    }

		
		
		

	}


