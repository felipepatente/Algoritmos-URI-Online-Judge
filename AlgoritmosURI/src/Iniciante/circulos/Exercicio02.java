package Iniciante.circulos;
import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		Circulo circulo = new Circulo();
		
		try {
			
			double area = circulo.getArea(raio);
			System.out.printf("Area: %.4f ", area);
			
		} catch (Exception e) {
			System.out.println("O valor do raio deve ser positivo");
		}
		
	}

}
