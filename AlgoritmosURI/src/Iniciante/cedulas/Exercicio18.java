package Iniciante.cedulas;

import javax.swing.JOptionPane;
import Iniciante.excecoes.ValorForaDoIntervaloException;
import Iniciante.utilidades.Util;

public class Exercicio18 {
	
	public static void main(String[] args){
		
		boolean continuar;
		
		do {
			
			continuar = false;
			
			try {
				
				int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
				
				Cedula cedula = new Cedula(valor);
				cedula.imprimir();
				
			}catch(ValorForaDoIntervaloException e){
				JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage()+ "\nDigite novamente");
				continuar = true;
			}catch (NumberFormatException e) {
				Util util = new Util();
				JOptionPane.showMessageDialog(null,util.getMensagemInput() + "\nDigite n�meros inteiros");
				JOptionPane.showMessageDialog(null,"Digite novamente");
				continuar = true;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage()+ "\nDigite novamente");
				continuar = true;
			}
			
		} while (continuar);
		
	}
}
/*Leia um valor inteiro. A seguir, calcule o menor n�mero de notas poss�veis (c�dulas) 
 * no qual o valor pode ser decomposto. As notas consideradas s�o de 100, 50, 20, 10, 5, 2 e 1. 
 * A seguir mostre o valor lido e a rela��o de notas necess�rias.
 * 
 * Entrada
 * O arquivo de entrada cont�m um valor inteiro N (0 < N < 1000000).
 * 
 */