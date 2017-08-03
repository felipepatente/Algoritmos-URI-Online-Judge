package Iniciante.idadedias;

import javax.swing.JOptionPane;
import Iniciante.excecoes.MenorOuIgual0Exception;
import Iniciante.utilidades.Util;

public class Exercicio20 {

	public static void main(String[] args) {

		boolean continuar;
		
		do {
			
			continuar = false;
			
			try {
				
				int tempo = Integer.parseInt(JOptionPane.showInputDialog
						("Digite a sua idade em dias:  "));
				
				Idade idade = new Idade(tempo);
				
				JOptionPane.showMessageDialog(null, idade.getAnos() + " ano(s)\n"
								+ idade.getMeses()+ " mes(es)\n"
								+ idade.getDias() + " dia(s)\n");
			
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

/*Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. 
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 
Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada

O arquivo de entrada contém um valor inteiro.

Saída

Imprima a saída conforme exemplo fornecido.

*/