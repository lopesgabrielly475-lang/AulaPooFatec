package Lista003;

import java.util.Scanner;

public class Exercício08 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		System.out.println("Quantos números deseja informar? ");
		         int quantidade = leitor.nextInt();
		         double soma = 0;
		         
		         for (int i = 1; i <= quantidade; i ++) {
		        	 System.out.println("Digite o" + i + "° valor: ");
		        	 soma +=
		        	leitor.nextDouble();		 
		         }
		
		         
		         double media = soma / quantidade;
		         System.out.println("A média dos valores é: " + media);
		         leitor.close();
		

	}

}
