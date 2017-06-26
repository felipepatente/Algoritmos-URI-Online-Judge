package Iniciante.diferencas;
import javax.swing.JOptionPane;
public class Exercicio7 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número: "));
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número: "));
		
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3° número: "));
		
		int num4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 4° número: "));
		
		Diferenca diferenca = new Diferenca(num1, num2, num3, num4);
		int resultado = diferenca.getDiferenca();
		
		JOptionPane.showMessageDialog(null,"DIFERENÇA: " + resultado);
		
		
	}
}
/*Leia quatro valores inteiros. A seguir, calcule e mostre a diferença do 
 * produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 * */
