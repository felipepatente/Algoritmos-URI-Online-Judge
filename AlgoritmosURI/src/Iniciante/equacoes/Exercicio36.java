package Iniciante.equacoes;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import Iniciante.excecoes.DivisaoPor0Exception;
import Iniciante.utilidades.Util;

public class Exercicio36 {
	
	public static void main(String[] args){
	
boolean continuar;
		
		do {
			
			continuar = false;
			
			try {
				
				double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
				double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
				double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C: "));
				
				Equacao equacao = new Equacao(a,b,c);
				
				if(equacao.getDelta() >= 0){
					
					DecimalFormat format = new DecimalFormat("0.00");
					JOptionPane.showMessageDialog(null,"R1 = " + format.format(equacao.getR1()) +"\n" + 
							"R2 = " + format.format(equacao.getR2()));
				}else{
					JOptionPane.showMessageDialog(null,"Impossível calcular");
				}
				
			}catch(DivisaoPor0Exception e){
				JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage()+ "\nDigite novamente");
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
/*Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação 
 * de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem 
 * correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de 
 * numero negativo.
 */