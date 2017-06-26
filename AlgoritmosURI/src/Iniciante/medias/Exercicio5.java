package Iniciante.medias;
import javax.swing.JOptionPane;

public class Exercicio5 {
	
	public static void main(String[] args){
		
		try {
			
			double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota: "));
			
			double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota: "));
			
			Media media = new Media();
			media.setNota1(nota1);
			media.setNota2(nota2);
			double resultado = media.getMedia();
			
			JOptionPane.showMessageDialog(null,"Média: " + resultado);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Só é permitida a entrada de número.\n"
					+ "Esses números tem que ser maior ou igual a 0");
		}
		
	}

}
