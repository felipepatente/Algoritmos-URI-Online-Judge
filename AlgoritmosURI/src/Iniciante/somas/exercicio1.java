package Iniciante.somas;
import javax.swing.JOptionPane;

public class exercicio1 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1� n�mero: "));
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2� n�mero: "));
		
		Soma soma = new Soma(num1, num2);
		int resultado = soma.getResultado();
		
		JOptionPane.showMessageDialog(null, "Resultado = " + resultado);
	}

}
