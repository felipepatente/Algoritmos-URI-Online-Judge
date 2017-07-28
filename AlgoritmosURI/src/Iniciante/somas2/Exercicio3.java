package Iniciante.somas2;
import javax.swing.JOptionPane;
public class Exercicio3 {
	
	public static void main(String[] args){
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número: "));
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número: "));
		
		Soma som = new Soma(num1, num2);
		int soma = som.getSoma();
		
		JOptionPane.showMessageDialog(null,"Soma: " + soma);
		
	}

}
