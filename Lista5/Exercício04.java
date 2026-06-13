package Lista05gabi;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		
		
		    
		        double nota1 = lerNota(1);
		        double nota2 = lerNota(2);
		        double nota3 = lerNota(3);

		        double media = calcularMedia(nota1, nota2, nota3);
		        String situacao = verificarSituacao(media);
		        
		        mostrarResultado(media, situacao);
		    }

		    public static double lerNota(int numeroNota) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite a nota " + numeroNota + ": ");
		        return scanner.nextDouble();
		    }

		    public static double calcularMedia(double n1, double n2, double n3) {
		        return (n1 + n2 + n3) / 3.0;
		    }

		    public static String verificarSituacao(double media) {
		        if (media >= 7.0) {
		            return "Aprovado";
		        } else if (media >= 5.0) {
		            return "Recuperação";
		        } else {
		            return "Reprovado";
		        }
		    }

		    public static void mostrarResultado(double media, String situacao) {
		        System.out.printf("Média Final: %.2f\n", media);
		        System.out.println("Situação do Aluno: " + situacao);
		    
		}
		

	}


