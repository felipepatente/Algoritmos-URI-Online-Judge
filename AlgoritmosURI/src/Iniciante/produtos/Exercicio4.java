package Iniciante.produtos;
import java.util.Scanner;
public class Exercicio4 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o 1° número: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite o 2° número: ");
		int num2 = sc.nextInt();
		
		Produto produto = new Produto();
		produto.setNum1(num1);
		produto.setNum2(num2);
		int resultado = produto.getProduto();
		
		System.out.println("Resultado: " + resultado);
		
		
	}

}
