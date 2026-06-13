package Lista05gabi;

import java.util.Scanner;
import java.util.Random;

public class Exercício12 {

	public static void main(String[] args) {
		
		mostrarMenu();
        String jogadaPlayer = jogadaJogador();
        String jogadaPC = jogadaComputador();
        
        System.out.println("Você escolheu: " + jogadaPlayer);
        System.out.println("Computador escolheu: " + jogadaPC);
        
        String vencedor = verificarVencedor(jogadaPlayer, jogadaPC);
        mostrarResultado(vencedor);
    }

    public static void mostrarMenu() {
        System.out.println("=== JO-KEN-PO ===");
        System.out.println("Escolha: Pedra, Papel ou Tesoura");
    }

    public static String jogadaJogador() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sua jogada: ");
        return scanner.nextLine().trim();
    }

    public static String jogadaComputador() {
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        Random random = new Random();
        return opcoes[random.nextInt(3)];
    }

    public static String verificarVencedor(String p, String c) {
        if (p.equalsIgnoreCase(c)) return "Empate";
        
        if ((p.equalsIgnoreCase("Pedra") && c.equalsIgnoreCase("Tesoura")) ||
            (p.equalsIgnoreCase("Papel") && c.equalsIgnoreCase("Pedra")) ||
            (p.equalsIgnoreCase("Tesoura") && c.equalsIgnoreCase("Papel"))) {
            return "Jogador";
        }
        return "Computador";
    }

    public static void mostrarResultado(String vencedor) {
        if (vencedor.equals("Empate")) {
            System.out.println("Temos um empate!");
        } else {
            System.out.println("Vencedor: " + vencedor + "!");
        }
    }


	}


