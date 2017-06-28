package Iniciante.salarios;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio8 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		Salario salario = new Salario();
		
		try{
			
			System.out.print("Digite o n�mero do funcion�rio: ");
			int numero = sc.nextInt();
			salario.setNumero(numero);
			
			System.out.print("Digite o n�mero de horas trabalhadas: ");
			double horasTrabalhadas = sc.nextDouble();
			salario.setHorasTrabalhadas(horasTrabalhadas);
			
			System.out.print("Digite o valor por hora trabalhada: ");
			double valorHora = sc.nextDouble();
			salario.setValorHora(valorHora);
			
			System.out.println("\nNumero: " + salario.getNumero());
			System.out.printf("Salario: R$ %.2f ", salario.getSalario());
			
		}catch(MenorZeroException e){
			System.out.println(e.getMessage());
		}catch(InputMismatchException e){
			System.out.println("S� � permitida a entrada de n�meros");
		}
		
	}

}
/*Escreva um programa que leia o n�mero de um funcion�rio, seu n�mero de horas 
 * trabalhadas, o valor que recebe por hora e calcula o sal�rio desse funcion�rio. 
 * A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.
 * */
