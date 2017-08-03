package Iniciante.selecoesvalores;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import Iniciante.excecoes.MenorOuIgual0Exception;
import Iniciante.gastoscombustivel.GastoCombustivel;
import Iniciante.utilidades.Util;

public class Exercicio35 {
	
	public static void main(String[] args){
		
boolean continuar;
		
		do {
			
			continuar = false;
			
			try {
				
				int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
				int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
				int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C: "));
				int d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de D: "));
				
				SelecaoValores selecao = new SelecaoValores(a,b,c,d);
				
				if(selecao.EhAceito()){
					JOptionPane.showMessageDialog(null,"Valores aceitos");
				}else{
					JOptionPane.showMessageDialog(null,"Valores n�o aceitos");
				}
				
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
/*Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, 
 * e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a vari�vel
 * A for par escrever a mensagem "Valores aceitos", sen�o escrever "Valores nao aceitos".
 * 
 * Entrada
 * Quatro n�meros inteiros A, B, C e D.
 *
 * Sa�da
 * Mostre a respectiva mensagem ap�s a valida��o dos valores.
 */

