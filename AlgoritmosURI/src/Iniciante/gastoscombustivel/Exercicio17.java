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
						("Digite a velocidade média gasta durante a mesma (em km/h)."));
				
				GastoCombustivel gasto = new GastoCombustivel(tempo, velocidade);
				
				DecimalFormat formatar = new DecimalFormat("0.000");
				
				JOptionPane.showMessageDialog(null,formatar.format(gasto.getQuantidadeLitros()));
				
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

/*Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar 
 * um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através de um simples programa. 
 * Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a 
 * mesma (em km/h). Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam 
 * necessários. Mostre o valor com 3 casas decimais após o ponto.
 
 * Entrada

 * O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e o segundo é a 
 * velocidade média durante a mesma (em km/h).

 * Saída
	
 * Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal
*/