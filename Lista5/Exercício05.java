package Lista05gabi;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int opcao;

        do {
            mostrarMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                double num1 = lerNumero("primeiro");
                double num2 = lerNumero("segundo");

                switch (opcao) {
                    case 1 -> System.out.println("Resultado: " + somar(num1, num2));
                    case 2 -> System.out.println("Resultado: " + subtrair(num1, num2));
                    case 3 -> System.out.println("Resultado: " + multiplicar(num1, num2));
                    case 4 -> System.out.println("Resultado: " + dividir(num1, num2));
                }
                System.out.println();
            } else if (opcao != 5) {
                System.out.println("Opção inválida!\n");
            }

        } while (opcao != 5);

        System.out.println("Calculadora encerrada.");
    }

    public static void mostrarMenu() {
        System.out.println("--- CALCULADORA ---");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Sair");
    }

    public static double lerNumero(String ordem) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o " + ordem + " número: ");
        return scanner.nextDouble();
    }

    public static double somar(double a, double b) { return a + b; }
    public static double subtrair(double a, double b) { return a - b; }
    public static double multiplicar(double a, double b) { return a * b; }
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
        return a / b;
    }

		

	}


