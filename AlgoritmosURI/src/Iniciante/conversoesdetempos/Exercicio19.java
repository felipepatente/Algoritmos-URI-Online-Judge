package Iniciante.conversoesdetempos;
import javax.swing.JOptionPane;
import Iniciante.excecoes.MenorOuIgual0Exception;
import Iniciante.utilidades.Util;

public class Exercicio19 {

	public static void main(String[] args) {
		
		boolean continuar;
		
		do {
			
			continuar = false;
			
			try {
				
				int tempoSegundos = Integer.parseInt(JOptionPane.showInputDialog
						("Digite um tempo (em segundos): "));
				
				ConversaoTempo tempo = new ConversaoTempo(tempoSegundos);
				
				JOptionPane.showMessageDialog
				(null, tempo.getHoras() + ":" + tempo.getMinutos() + ":" + tempo.getSegundos());
				
			}catch(MenorOuIgual0Exception e){
				JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage()+ "\nDigite novamente");
				continuar = true;
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
/* Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, 
 * e informe-o expresso no formato horas:minutos:segundos.
 * 
 * Entrada
 * O arquivo de entrada contém um valor inteiro N.
 *
 * Saída
 * Imprima o tempo lido no arquivo de entrada (segundos), convertido para 
 * horas:minutos:segundos, conforme exemplo fornecido.
 */

