package Jogoslegais;

import java.util.Scanner;

public class Jogodaadivinhação {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 100) + 1; // 1 a 100
        int limiteTentativas = 10;

        System.out.println("=== JOGO DA ADIVINHAÇÃO ===");
        System.out.println("O computador escolheu um número entre 1 e 100. Você tem 10 tentativas!");

        // Descomente a versão que deseja testar:
        jogarComDoWhile(scanner, numeroSecreto, limiteTentativas);
        // jogarComWhile(scanner, numeroSecreto, limiteTentativas);
        // jogarComDoWhile(scanner, numeroSecreto, limiteTentativas);

        scanner.close();
    }

    // Lendo e validando o palpite para evitar quebra do programa
    private static int obterPalpiteValido(Scanner scanner) {
        while (true) {
            System.out.print("Digite seu palpite (1-100): ");
            if (scanner.hasNextInt()) {
                int palpite = scanner.nextInt();
                if (palpite >= 1 && palpite <= 100) {
                    return palpite;
                }
                System.out.println("Por favor, digite um número dentro do intervalo de 1 a 100.");
            } else {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                scanner.next(); // Limpa o buffer
            }
        }
    }

    // VERSÃO 1: Usando FOR
    public static void jugarComFor(Scanner scanner, int numeroSecreto, int limite) {
        System.out.println("\n-> Executando versão com laço FOR");
        boolean acertou = false;

        for (int tentativa = 1; tentativa <= limite; tentativa++) {
            System.out.println("Tentativa " + tentativa + "/" + limite);
            int palpite = obterPalpiteValido(scanner);

            if (palpite == numeroSecreto) {
                System.out.println("Você acertou! Parabéns!");
                acertou = true;
                break;
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor!");
            } else {
                System.out.println("O número secreto é maior!");
            }
        }
        if (!acertou) {
            System.out.println("Fim de jogo! Você não conseguiu acertar. O número era: " + numeroSecreto);
        }
    }

    // VERSÃO 2: Usando WHILE
    public static void jogarComWhile(Scanner scanner, int numeroSecreto, int limite) {
        System.out.println("\n-> Executando versão com laço WHILE");
        int tentativa = 1;
        boolean acertou = false;

        while (tentativa <= limite && !acertou) {
            System.out.println("Tentativa " + tentativa + "/" + limite);
            int palpite = obterPalpiteValido(scanner);

            if (palpite == numeroSecreto) {
                System.out.println("Você acertou! Parabéns!");
                acertou = true;
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor!");
                tentativa++;
            } else {
                System.out.println("O número secreto é maior!");
                tentativa++;
            }
        }
        if (!acertou) {
            System.out.println("Fim de jogo! O número secreto era: " + numeroSecreto);
        }
    }

    // VERSÃO 3: Usando DO/WHILE
    public static void jogarComDoWhile(Scanner scanner, int numeroSecreto, int limite) {
        System.out.println("\n-> Executando versão com laço DO/WHILE");
        int tentativa = 1;
        boolean acertou = false;

        do {
            System.out.println("Tentativa " + tentativa + "/" + limite);
            int palpite = obterPalpiteValido(scanner);

            if (palpite == numeroSecreto) {
                System.out.println("Você acertou! Parabéns!");
                acertou = true;
            } else {
                if (palpite > numeroSecreto) {
                    System.out.println("O número secreto é menor!");
                } else {
                    System.out.println("O número secreto é maior!");
                }
                tentativa++;
            }
        } while (tentativa <= limite && !acertou);

        if (!acertou) {
            System.out.println("Fim de jogo! O número secreto era: " + numeroSecreto);
        }
    }

		

	}


