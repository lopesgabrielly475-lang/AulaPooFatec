package Jogoslegais;

import java.util.Random;
import java.util.Scanner;

public class Cofremisterioso {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continuarJogo = true;
        int pontuacaoTotal = 0;

        System.out.println("=================================");
        System.out.println("  Bem-vindo ao Cofre Misterioso! ");
        System.out.println("=================================");

        // LAÇO 1: while para manter o jogo ativo por várias rodadas
        while (continuarJogo) {
            int maxIntervalo = escolherDificuldade(scanner);
            int codigoSecreto = 1 + random.nextInt(maxIntervalo);
            int maxTentativas = 5;
            boolean cofreAberto = false;
            int pontuacaoRodada = 10; // Começa com o bônus máximo da rodada

            System.out.println("\nO cofre foi trancado! O código está entre 1 e " + maxIntervalo + ".");

            // LAÇO 2: for para controlar as 5 tentativas
            for (int tent = 1; tent <= maxTentativas; tent++) {
                System.out.print("Tentativa " + tent + "/" + maxTentativas + " - Seu palpite: ");
                
                int palpite = lerPalpiteValido(scanner);

                if (palpite == codigoSecreto) {
                    System.out.println("\n🎉 SUCESSO! Clique... Clack... Cofre aberto!");
                    System.out.println("Código correto: " + codigoSecreto);
                    exibirFeedbackAnimado(tent);
                    cofreAberto = true;
                    break;
                } else {
                    pontuacaoRodada = Math.max(0, pontuacaoRodada - 2); // Penalidade de -2 por erro (mínimo 0)
                    int restam = maxTentativas - tent;
                    
                    if (restam > 0) {
                        if (palpite > codigoSecreto) {
                            System.out.println("O código é MENOR. Restam " + restam + " tentativas.");
                        } else {
                            System.out.println("O código é MAIOR. Restam " + restam + " tentativas.");
                        }
                        System.out.println("---------------------------------");
                    }
                }
            }

            if (!cofreAberto) {
                System.out.println("\n💥 Alarme disparado! As tentativas acabaram.");
                System.out.println("O código secreto era: " + codigoSecreto);
                pontuacaoRodada = 0; // Não pontua se perder
            }

            pontuacaoTotal += pontuacaoRodada;
            System.out.println("Pontuação nesta rodada: +" + pontuacaoRodada);
            System.out.println("Pontuação total acumulada: " + pontuacaoTotal);

            // LAÇO 3: do-while para validar a resposta de jogar novamente (s/n)
            char resposta;
            do {
                System.out.print("\nDeseja jogar novamente? (s/n): ");
                String entrada = scanner.next().trim().toLowerCase();
                resposta = entrada.isEmpty() ? ' ' : entrada.charAt(0);
                
                if (resposta != 's' && resposta != 'n') {
                    System.out.println("Opção inválida! Digite apenas 's' para sim ou 'n' para não.");
                }
            } while (resposta != 's' && resposta != 'n');

            if (resposta == 'n') {
                continuarJogo = false;
            }
        }

        System.out.println("\n=================================");
        System.out.println("Obrigado por jogar!");
        System.out.println("Pontuação Final: " + pontuacaoTotal);
        System.out.println("Fim.");
        System.out.println("=================================");
        scanner.close();
    }

    private static int escolherDificuldade(Scanner scanner) {
        while (true) {
            System.out.println("\nEscolha a dificuldade:");
            System.out.println("[1] Fácil   (1 a 20)");
            System.out.println("[2] Médio   (1 a 50)");
            System.out.println("[3] Difícil (1 a 100)");
            System.out.print("Opção: ");

            if (scanner.hasNextInt()) {
                int opcao = scanner.nextInt();
                if (opcao == 1) return 20;
                if (opcao == 2) return 50;
                if (opcao == 3) return 100;
            } else {
                scanner.next(); // Limpa caracteres inválidos
            }
            System.out.println("Escolha inválida! Digite 1, 2 ou 3.");
        }
    }

    private static int lerPalpiteValido(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Erro: Cartões magnéticos e letras não abrem o cofre! Digite apenas números.");
            System.out.print("Seu palpite: ");
            scanner.next(); // Limpa buffer
        }
        return scanner.nextInt();
    }

    private static void exibirFeedbackAnimado(int tentativa) {
        if (tentativa == 1) {
            System.out.println("Feedback: Impressionante! Você tem poderes psíquicos? Acertou de primeira!");
        } else if (tentativa <= 3) {
            System.out.println("Feedback: Muito bom! Ótima estratégia de dedução.");
        } else {
            System.out.println("Feedback: Ufa! Foi por pouco, mas a sua persistência valeu a pena.");
        }
    }

		

	}


