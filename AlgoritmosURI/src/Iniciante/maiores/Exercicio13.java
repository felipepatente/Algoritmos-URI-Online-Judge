package Iniciante.maiores;
import javax.swing.JOptionPane;
import Iniciante.utilidades.Util;

public class Exercicio13 {
	
	public static void main(String[] args){
		
		boolean continuar;
		
		do {
			
			continuar = false;
			
			try {
				
				double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1� N�mero: "));
				double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2� N�mero: "));
				double num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 3� N�mero: "));
				
				MaiorNumero maior = new MaiorNumero(num1,num2,num3);
				
				JOptionPane.showMessageDialog(null,"Maior N�mero: " + maior.getMaior());
			
			}catch (NumberFormatException e) {
				Util util = new Util();
				JOptionPane.showMessageDialog(null,util.getMensagemInput());
				JOptionPane.showMessageDialog(null,"Digite novamente");
				continuar = true;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage()+ "\nDigite novamente");
				continuar = true;
			}
			
		} while (continuar);

	}

}
//Fa�a um programa que leia tr�s valores e apresente o maior dos tr�s valores lidos 















