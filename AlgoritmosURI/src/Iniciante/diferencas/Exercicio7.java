package Iniciante.diferencas;
import javax.swing.JOptionPane;
public class Exercicio7 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1� n�mero: "));
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2� n�mero: "));
		
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3� n�mero: "));
		
		int num4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 4� n�mero: "));
		
		Diferenca diferenca = new Diferenca(num1, num2, num3, num4);
		int resultado = diferenca.getDiferenca();
		
		JOptionPane.showMessageDialog(null,"DIFEREN�A: " + resultado);
		
		
	}
}
/*Leia quatro valores inteiros. A seguir, calcule e mostre a diferen�a do 
 * produto de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
 * */
