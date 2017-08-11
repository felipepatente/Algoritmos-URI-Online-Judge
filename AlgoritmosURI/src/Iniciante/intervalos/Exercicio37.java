package Iniciante.intervalos;

import javax.swing.JOptionPane;
import Iniciante.utilidades.Util;

public class Exercicio37 {
	
	public static void main(String[] args){
		
		boolean continuar;
		
		do {
			
			continuar = false;
			
			try {
				
				double numero = Double.parseDouble(JOptionPane.showInputDialog
						("Digite um valor inteiro: "));
				
				Intervalo intervalo = new Intervalo(numero);
				
				JOptionPane.showMessageDialog(null, intervalo.getIntervalo());
				
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
/* Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes
 * intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver 
 * em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 *  
 * O símbolo ( representa "maior que". Por exemplo:
 * [0,25]  indica valores entre 0 e 25.0000, inclusive eles.
 * (25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000
 */