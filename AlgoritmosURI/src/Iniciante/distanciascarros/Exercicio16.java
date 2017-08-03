package Iniciante.distanciascarros;

import javax.swing.JOptionPane;
import Iniciante.excecoes.MenorOuIgual0Exception;
import Iniciante.utilidades.Util;

public class Exercicio16 {
	
	public static void main(String[] args){
		
		boolean continuar;
		
		do {
			
			continuar = false;
			
			try {
				
				double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a dist�ncia em km: "));
				
				DistanciaCarro disCarro = new DistanciaCarro();
				disCarro.setDistancia(distancia);
				
				JOptionPane.showMessageDialog(null, disCarro.getMinutos() + " minutos");
				
			}catch(MenorOuIgual0Exception e){
				JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage()+ "\nDigite novamente");
				continuar = true;
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
/*Dois carros (X e Y) partem em uma mesma dire��o. O carro X sai com velocidade 
 *constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h. 
 *
 *Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quil�metros do carro X, 
 *ou seja, consegue se afastar um quil�metro a cada 2 minutos.
 *
 *Leia a dist�ncia (em Km) e calcule quanto tempo leva (em minutos) para o carro Y 
 *tomar essa dist�ncia do outro carro.
 *
 *Entrada
 *
 *O arquivo de entrada cont�m um n�mero inteiro.
 *
 *Sa�da
 *
 *Imprima o tempo necess�rio seguido da mensagem " minutos".
*/
