package Lista05gabi;

import java.util.Random;
import java.util.Scanner;

public class Exercício11 {

	public static void main(String[] args) {
		
		int numeroSecreto = sortearNumero();
        boolean acertou = false;
        
        System.out.println("Tente adivinhar o número de 1 a 20!");

        while (!acertou) {
            int palpite = lerPalpite();
            acertou = verificarAcerto(palpite, numeroSecreto);
            
            if (!acertou) {
                mostrarDica(palpite, numeroSecreto);
            }
        }
        mostrarVitoria();
    }

    public static int sortearNumero() {
        Random random = new Random();
        return random.nextInt(20) + 1;
    }

    public static int lerPalpite() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seu palpite: ");
        return scanner.nextInt();
    }

    public static boolean verificarAcerto(int palpite, int secreto) {
        return palpite == secreto;
    }

    public static void mostrarDica(int palpite, int secreto) {
        if (palpite < secreto) {
            System.out.println("Dica: O número secreto é MAIOR.");
        } else {
            System.out.println("Dica: O número secreto é MENOR.");
        }
    }

    public static void mostrarVitoria() {
        System.out.println("Parabéns! Você descobriu o número secreto!");
    }

		

	}


