package Jogoslegais;

import java.util.Scanner;

public class Jogodavelha {
	
	private static char[][] tabuleiro = new char[3][3];
    private static char jogadorAtual = 'X';

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        inicializarTabuleiro();
        boolean jogoAtivo = true;
        int jogadas = 0;

        System.out.println("=== JOGO DA VELHA ===");

        while (jogoAtivo) {
            imprimirTabuleiro();
            int[] jogada = lerJogada(scanner);
            int linha = jogada[0];
            int coluna = jogada[1];

            tabuleiro[linha][coluna] = jogadorAtual;
            jogadas++;

            if (verificarVitoria(linha, coluna)) {
                imprimirTabuleiro();
                System.out.println("Parabéns! O jogador " + jogadorAtual + " venceu!");
                jogoAtivo = false;
            } else if (jogadas == 9) {
                imprimirTabuleiro();
                System.out.println("Empate! O tabuleiro está cheio.");
                jogoAtivo = false;
            } else {
                // Alterna o jogador: se for X vira O, se for O vira X
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }
        scanner.close();
    }

    private static void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    private static void imprimirTabuleiro() {
        System.out.println("\n  1   2   3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("  ---------");
        }
        System.out.println();
    }

    private static int[] lerJogada(Scanner scanner) {
        int linha = -1, coluna = -1;
        while (true) {
            System.out.print("Jogador [" + jogadorAtual + "], digite a linha e coluna (1-3) separados por espaço: ");
            if (scanner.hasNextInt()) {
                linha = scanner.nextInt() - 1; // Ajusta para índice 0-2
                if (scanner.hasNextInt()) {
                    coluna = scanner.nextInt() - 1;
                    
                    // Validação das regras
                    if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3) {
                        if (tabuleiro[linha][coluna] == ' ') {
                            return new int[]{linha, coluna};
                        } else {
                            System.out.println("Erro: Essa casa já está ocupada! Tente novamente.");
                        }
                    } else {
                        System.out.println("Erro: Posição inválida! Escolha números entre 1 e 3.");
                    }
                } else {
                    scanner.next(); // Limpa entrada inválida
                }
            } else {
                scanner.next(); // Limpa entrada inválida
                System.out.println("Erro: Entrada inválida! Digite apenas números.");
            }
        }
    }

    private static boolean verificarVitoria(int l, int c) {
        // Verifica linha
        if (tabuleiro[l][0] == jogadorAtual && tabuleiro[l][1] == jogadorAtual && tabuleiro[l][2] == jogadorAtual) return true;
        // Verifica coluna
        if (tabuleiro[0][c] == jogadorAtual && tabuleiro[1][c] == jogadorAtual && tabuleiro[2][c] == jogadorAtual) return true;
        // Verifica diagonal principal
        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) return true;
        // Verifica diagonal secundária
        if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) return true;
        
        return false;
    }

		
		
		

	}


