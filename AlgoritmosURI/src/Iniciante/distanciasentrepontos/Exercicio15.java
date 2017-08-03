package Iniciante.distanciasentrepontos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import Iniciante.utilidades.Util;

public class Exercicio15 {
	
	public static void main(String[] args){
		
		boolean continuar;
		
		do {
			
			continuar = false;
			
			try {
				
				double x1 = Double.parseDouble(JOptionPane.showInputDialog
						("Digite o valor para o 1° ponto do eixo x1: "));
				
				double y1 = Double.parseDouble(JOptionPane.showInputDialog
						("Digite o valor para o 2° ponto do eixo y1: "));
				
				double x2 = Double.parseDouble(JOptionPane.showInputDialog
						("Digite o valor para o 1° ponto do plano x2: "));
				
				double y2 = Double.parseDouble(JOptionPane.showInputDialog
						("Digite o valor para o 2° ponto do plano y2: "));
				
				DistanciaPonto distancia = new DistanciaPonto(x1, y1, x2, y2);
				
				DecimalFormat formatar = new DecimalFormat("0.0000");
				JOptionPane.showMessageDialog(null,"Distância entre Pontos: " 
				+ formatar.format(distancia.getDistanciaEntrePontos()));
			
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

/*Leia os quatro valores correspondentes aos eixos x e y de dois pontos 
 * quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, 
 * mostrando 4 casas decimais após a vírgula.*/
