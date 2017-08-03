package Iniciante.calculospecas;
import java.util.InputMismatchException;
import java.util.Scanner;

import Iniciante.excecoes.MenorOuIgual0Exception;
import Iniciante.utilidades.Util;
public class Exercicio10 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		try{
			
			System.out.println("Digite o código da peça 1: ");
			int codPeca1 = sc.nextInt();
			
			System.out.println("Digite a quantidade de peças: ");
			int qtdPeca1 = sc.nextInt();
			
			System.out.println("Digite o valor únitario da peça 1: ");
			double precoPeca1 = sc.nextDouble();
			
			
			System.out.println("Digite o código da peça 2: ");
			int codPeca2 = sc.nextInt();
			
			System.out.println("Digite a quantidade de peças: ");
			int qtdPeca2 = sc.nextInt();
			
			System.out.println("Digite o valor únitario da peça 2: ");
			double precoPeca2 = sc.nextDouble();
			
			
			CalcularPeca peca1 = new CalcularPeca(codPeca1,qtdPeca1,precoPeca1);
			CalcularPeca peca2 = new CalcularPeca(codPeca2,qtdPeca2,precoPeca2);
			
			double total = peca1.getValor() + peca2.getValor();
			
			System.out.printf("VALOR A PAGAR: %.2f ", total);
		
		}catch (InputMismatchException e) {
			
			Util util = new Util();
			System.out.println(util.getMensagemInput() + 
					"\n3 - Digite números inteiros nos códigos e nas quantidades das peças");
			
		}catch(MenorOuIgual0Exception e){
			System.out.println("ERROR: " + e.getMessage());
		}catch(Exception e){
			System.out.println("ERROR: " + e.getMessage());
		}
		
		
	}

}
/*Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
 * o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 
 * e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
 * */
