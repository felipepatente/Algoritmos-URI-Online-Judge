package Iniciante.coodernadas;

import javax.swing.JOptionPane;
import Iniciante.utilidades.Util;

public class Exercicio1041 {

	public static void main(String[] args) {
		
		boolean continuar;
		
		do {
			
			continuar = false;
			
			try {
				
				Double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o ponto X: "));
				Double y = Double.parseDouble(JOptionPane.showInputDialog("Digite o ponto Y: "));
				
				
				Coodernada co = new Coodernada(x, y);
				
				JOptionPane.showMessageDialog(null,"Resultado: " + co.getCoodernada());
					
				
			}catch (NumberFormatException e) {
				Util util = new Util();
				JOptionPane.showMessageDialog(null,util.getMensagemInput() + "\nDigite números inteiros");
				JOptionPane.showMessageDialog(null,"Digite novamente");
				continuar = true;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage()+ "\nDigite novamente");
				continuar = true;
			}
			
		} while (continuar);
	}

}
