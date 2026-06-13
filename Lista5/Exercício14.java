package Lista05gabi;

import java.util.Scanner;

public class Exercício14 {
	
	private static double saldo = 500.00; // Saldo inicial fictício
    private static boolean sistemaAtivo = true;

	public static void main(String[] args) {
		
		while (sistemaAtivo) {
            mostrarMenu();
            int opcao = lerOpcao();
            processarOpcao(opcao);
            System.out.println();
        }
    }

    public static void mostrarMenu() {
        System.out.println("=== CAIXA ELETRÔNICO ===");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Encerrar Sistema");
    }

    public static int lerOpcao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha a operação: ");
        return scanner.nextInt();
    }

    public static void processarOpcao(int op) {
        switch (op) {
            case 1 -> consultarSaldo();
            case 2 -> depositar();
            case 3 -> sacar();
            case 4 -> encerrarSistema();
            default -> System.out.println("Opção inválida.");
        }
    }

    public static void consultarSaldo() {
        System.out.printf("Saldo disponível: R$ %.2f\n", saldo);
    }

    public static void depositar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor para depositar: R$ ");
        double valor = scanner.nextDouble();
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito processado.");
        }
    }

    public static void sacar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor para sacar: R$ ");
        double valor = scanner.nextDouble();
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque efetuado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public static void encerrarSistema() {
        System.out.println("Obrigado por utilizar nossos serviços!");
        sistemaAtivo = false;
    }

		
		

	}


