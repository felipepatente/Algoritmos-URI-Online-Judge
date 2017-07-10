package Iniciante.salariosBonus;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio9 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("Digite o nome do funcionario: ");
			String nome = sc.nextLine();
			
			System.out.print("Digite o salario fixo: ");
			double salarioFixo = sc.nextDouble();
			
			System.out.print("Digite o total de vendas efetuadas: ");
			double totVendas = sc.nextDouble();
			
			SalarioBonus salario = new SalarioBonus(nome);
			salario.setSalarioFixo(salarioFixo);
			salario.setTotVendas(totVendas);
			
			System.out.printf("TOTAL = R$ %.2f ", salario.getSalario());
			
		} catch (InputMismatchException e) {
			System.out.println("ERROR: Só é permitido a entrada de números. "
					+ "Se for necessário colocar casas decimais, separ por virgulas");
			
		}catch(MenorQue0Exception e){
			System.out.println("ERROR: " + e.getMessage());
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de 
 * vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% 
 * de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, 
 * com duas casas decimais.
 * */
 