package Iniciante.gastoscombustivel;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import Iniciante.excecoes.MenorOuIgual0Exception;
import Iniciante.utilidades.Util;

public class Exercicio17 {

	public static void main(String[] args) {

		boolean continuar;
		
		do {
			
			continuar = false;
			
			try {
				
				int tempo = Integer.parseInt(JOptionPane.showInputDialog
						("Digite o tempo gasto na viagem (em horas) "));
				
				int velocidade = Integer.parseInt(JOptionPane.showInputDialog
						("Digite a velocidade m�dia gasta durante a mesma (em km/h)."));
				
				GastoCombustivel gasto = new GastoCombustivel(tempo, velocidade);
				
				DecimalFormat formatar = new DecimalFormat("0.000");
				
				JOptionPane.showMessageDialog(null,formatar.format(gasto.getQuantidadeLitros()));
				
			}catch(MenorOuIgual0Exception e){
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

/*Joaozinho quer calcular e mostrar a quantidade de litros de combust�vel gastos em uma viagem, ao utilizar 
 * um autom�vel que faz 12 KM/L. Para isso, ele gostaria que voc� o auxiliasse atrav�s de um simples programa. 
 * Para efetuar o c�lculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade m�dia durante a 
 * mesma (em km/h). Assim, pode-se obter dist�ncia percorrida e, em seguida, calcular quantos litros seriam 
 * necess�rios. Mostre o valor com 3 casas decimais ap�s o ponto.
 
 * Entrada

 * O arquivo de entrada cont�m dois inteiros. O primeiro � o tempo gasto na viagem (em horas) e o segundo � a 
 * velocidade m�dia durante a mesma (em km/h).

 * Sa�da
	
 * Imprima a quantidade de litros necess�ria para realizar a viagem, com tr�s d�gitos ap�s o ponto decimal
*/