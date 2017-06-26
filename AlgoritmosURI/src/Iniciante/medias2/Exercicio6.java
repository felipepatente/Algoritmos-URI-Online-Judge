package Iniciante.medias2;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("Digite a 1° nota: ");
			double nota1 = sc.nextDouble();
			
			System.out.print("Digite a 2° nota: ");
			double nota2 = sc.nextDouble();
			
			System.out.print("Digite a 3° nota: ");
			double nota3 = sc.nextDouble();
			
			Media media = new Media();
			
			media.setNota1(nota1);
			media.setNota2(nota2);
			media.setNota3(nota3);
			
			double resultado = media.getMedia();
			
			System.out.printf("Média: %.1f ", resultado);
			
		} catch (Exception e) {
			System.out.println("Só é permitida a entrada de número.\n"
					+ "Esses números tem que ser maior ou igual a 0");
			
		}
	}

}
