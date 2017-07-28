package Iniciante.salarios;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio8 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		Salario salario = new Salario();
		
		try{
			
			System.out.print("Digite o número do funcionário: ");
			int numero = sc.nextInt();
			salario.setNumero(numero);
			
			System.out.print("Digite o número de horas trabalhadas: ");
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
			System.out.println("Só é permitida a entrada de números");
		}
		
	}

}
/*Escreva um programa que leia o número de um funcionário, seu número de horas 
 * trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. 
 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 * */
