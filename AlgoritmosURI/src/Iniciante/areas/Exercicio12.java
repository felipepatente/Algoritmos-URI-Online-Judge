package Iniciante.areas;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import Iniciante.excecoes.MenorOuIgual0Exception;
import Iniciante.utilidades.Util;

public class Exercicio12 {

	public static void main(String[] args) {
		
		
		try {
			
			double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° valor: "));
			double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° valor: "));
			double valor3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 3° valor: "));
			
			Geometria geometria = new Geometria(valor1, valor2, valor3);
			
			DecimalFormat df = new DecimalFormat("0.000");
			
			JOptionPane.showMessageDialog(null,"TRIANGULO: " + df.format(geometria.getTrianguloRetangulo()) + "\n" +  
												"CIRCULO: " + df.format(geometria.getCirculo()) + "\n" +  
												"TRAPEZIO: " + df.format(geometria.getTrapezio()) + "\n" +
												"QUADRADO: " + df.format(geometria.getQuadrado()) + "\n" +
												"RETANGULO: " + df.format(geometria.getRetangulo()));
			
		}catch(MenorOuIgual0Exception e){
			JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage());
		}catch (NumberFormatException e) {
			Util util = new Util();
			JOptionPane.showMessageDialog(null,util.getMensagemInput());
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage());
		}

	}
}
/*Escreva um programa que leia três valores: A, B e C. Em seguida, calcule e mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B. 
 */