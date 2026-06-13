package Lista05gabi;

import java.util.Scanner;

public class Exercício15 {
		
		private static String jogador;
	    private static int pontuacao = 0;

	    public static void main(String[] args) {
	        iniciarJogo();
	        mostrarMenu();
	        criarJogador();
	        
	        // Perguntas do Quiz representam os turnos
	        ejecutarTurno("Qual linguagem de programação estamos usando?", "Java");
	        ejecutarTurno("Funções devem ter quantas responsabilidades?", "Uma");
	        
	        verificarVitoria();
	        encerrarJogo();
	    }

	    public static void iniciarJogo() {
	        System.out.println("=================================");
	        System.out.println("   BEM-VINDO AO QUIZ DE DEV!");
	        System.out.println("=================================");
	    }

	    public static void mostrarMenu() {
	        System.out.println("Regras: Responda corretamente para ganhar pontos.");
	        System.out.println("---------------------------------");
	    }

	    public static void criarJogador() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Informe seu Nickname: ");
	        jogador = scanner.nextLine();
	        System.out.println("Boa sorte, " + jogador + "!\n");
	    }

	    public static void ejecutarTurno(String pergunta, String respostaCorreta) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("PERGUNTA: " + pergunta);
	        System.out.print("Sua resposta: ");
	        String resposta = scanner.nextLine();
	        
	        if (resposta.equalsIgnoreCase(respostaCorreta)) {
	            System.out.println("Acertou! +10 pontos.\n");
	            pontuacao += 10;
	        } else {
	            System.out.println("Errou! A resposta era: " + respostaCorreta + "\n");
	        }
	    }

	    public static void verificarVitoria() {
	        System.out.println("--- FIM DOS TURNOS ---");
	        if (pontuacao >= 20) {
	            System.out.println("Excelente, " + jogador + "! Você teve vitória perfeita!");
	        } else if (pontuacao > 0) {
	            System.out.println("Bom trabalho, " + jogador + "! Você pontuou.");
	        } else {
	            System.out.println("Que pena, " + jogador + "... Mais sorte na próxima vez.");
	        }
	    }

	    public static void encerrarJogo() {
	        System.out.println("Pontuação final: " + pontuacao);
	        System.out.println("Obrigado por jogar!");
	    
	
		

	}

}
