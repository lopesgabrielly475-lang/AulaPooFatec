package Lista05gabi;

import java.util.Scanner;

public class Exercício08 {

	public static void main(String[] args) {
		
		String nome = lerNome();
        int idade = lerIdade();
        String cidade = lerCidade();
        
        mostrarResumo(nome, idade, cidade);
    }

    public static String lerNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        return scanner.nextLine();
    }

    public static int lerIdade() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        return scanner.nextInt();
    }

    public static String lerCidade() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua cidade: ");
        return scanner.nextLine();
    }

    public static void mostrarResumo(String nome, int idade, String city) {
        System.out.println("\n=== RESUMO DO CADASTRO ===");
        System.out.println("Nome:   " + nome);
        System.out.println("Idade:  " + idade + " anos");
        System.out.println("Cidade: " + city);
        System.out.println("==========================");
    }

		
		

	}


