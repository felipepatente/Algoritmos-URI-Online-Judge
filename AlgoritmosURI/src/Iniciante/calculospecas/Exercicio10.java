package Iniciante.calculospecas;
import java.util.InputMismatchException;
import java.util.Scanner;

import Iniciante.excecoes.MenorOuIgual0Exception;
import Iniciante.utilidades.Util;
public class Exercicio10 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		try{
			
			System.out.println("Digite o c�digo da pe�a 1: ");
			int codPeca1 = sc.nextInt();
			
			System.out.println("Digite a quantidade de pe�as: ");
			int qtdPeca1 = sc.nextInt();
			
			System.out.println("Digite o valor �nitario da pe�a 1: ");
			double precoPeca1 = sc.nextDouble();
			
			
			System.out.println("Digite o c�digo da pe�a 2: ");
			int codPeca2 = sc.nextInt();
			
			System.out.println("Digite a quantidade de pe�as: ");
			int qtdPeca2 = sc.nextInt();
			
			System.out.println("Digite o valor �nitario da pe�a 2: ");
			double precoPeca2 = sc.nextDouble();
			
			
			CalcularPeca peca1 = new CalcularPeca(codPeca1,qtdPeca1,precoPeca1);
			CalcularPeca peca2 = new CalcularPeca(codPeca2,qtdPeca2,precoPeca2);
			
			double total = peca1.getValor() + peca2.getValor();
			
			System.out.printf("VALOR A PAGAR: %.2f ", total);
		
		}catch (InputMismatchException e) {
			
			Util util = new Util();
			System.out.println(util.getMensagemInput() + 
					"\n3 - Digite n�meros inteiros nos c�digos e nas quantidades das pe�as");
			
		}catch(MenorOuIgual0Exception e){
			System.out.println("ERROR: " + e.getMessage());
		}catch(Exception e){
			System.out.println("ERROR: " + e.getMessage());
		}
		
		
	}

}
/*Neste problema, deve-se ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, 
 * o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 
 * e o valor unit�rio de cada pe�a 2. Ap�s, calcule e mostre o valor a ser pago.
 * */
