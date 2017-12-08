package Iniciante.lanches;

import java.util.Scanner;

import Iniciante.excecoes.ValorForaDoIntervaloException;
import Iniciante.utilidades.Util;

public class Exercicio38 {
	
	private static Scanner sc;

	public static void main(String[] args){
		
		boolean continuar;
		int codigo, quantidade;
		
		do {
			
			continuar = false;
			
			
			try {
				
				sc = new Scanner(System.in);
				
				System.out.println("\nCódigo   Produto            Preço");
				System.out.println("1        Cachorro Quente    R$ 4.00");
				System.out.println("2        X-Salada           R$ 4.50");
				System.out.println("3        X-Bacon            R$ 5.00");
				System.out.println("4        Torrada Simples    R$ 2.00");
				System.out.println("5        Refrigerante       R$ 1.50");
				
				System.out.print("\nDigite o código do produto: ");
				codigo = sc.nextInt();
				
				System.out.print("Digite a quantidade: ");
				quantidade = sc.nextInt();
				
				Lanche lanche = new Lanche(codigo, quantidade);
				
				System.out.println("Total: R$ " + lanche.getTotal());
				
				
			}catch(ValorForaDoIntervaloException e){
				System.out.println(e.getMessage() + "\nDigite novamente");
				continuar = true;
			}catch (NumberFormatException e) {
				Util util = new Util();
				System.out.println(util.getMensagemInput() + "\nDigite números inteiros");				
				System.out.println(e.getMessage() + "\nDigite Novamente");
				continuar = true;
			}catch(Exception e){
				System.out.println("ERROR: " + e.getMessage()+ "\nDigite novamente");				
				continuar = true;
			}
			
		} while (continuar);
		
	}

}
