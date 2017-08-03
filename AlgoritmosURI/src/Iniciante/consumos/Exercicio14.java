package Iniciante.consumos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import Iniciante.excecoes.MenorQue0Exception;
import Iniciante.utilidades.Util;

public class Exercicio14 {

	public static void main(String[] args){
		
		boolean continuar;
		
		do {
			
			continuar = false;
			
			try {
				
				double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância percorrida em km: "));
				double combustivel = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de comsutivel(L) gasto: "));
				
				Consumo consumo = new Consumo(distancia,combustivel);
				
				DecimalFormat formatar = new DecimalFormat("0.000");
				JOptionPane.showMessageDialog(null,formatar.format(consumo.getConsumoMedio()) + " km/l");
			
			}catch(MenorQue0Exception e){
				JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage()+ "\nDigite novamente");
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

/*Calcule o consumo médio de um automóvel sendo fornecidos a distância total 
 * percorrida (em Km) e o total de combustível gasto (em litros).
 */