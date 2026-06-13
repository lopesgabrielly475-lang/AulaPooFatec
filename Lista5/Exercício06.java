package Lista05gabi;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		
		int numero = lerNumero();
        exibirTabuada(numero);
    }

    public static int lerNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Deseja ver a tabuada de qual número? ");
        return scanner.nextInt();
    }

    public static void mostrarLinha(int numero, int multiplicador) {
        int resultado = numero * multiplicador;
        System.out.println(numero + " x " + multiplicador + " = " + resultado);
    }

    public static void exibirTabuada(int numero) {
        System.out.println("\nTabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            mostrarLinha(numero, i);
        }
    }
}
		
		