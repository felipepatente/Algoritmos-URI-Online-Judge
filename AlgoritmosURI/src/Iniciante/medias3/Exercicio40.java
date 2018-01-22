package Iniciante.medias3;

import javax.swing.JOptionPane;

import Iniciante.excecoes.NotaMediaException;
import Iniciante.utilidades.Util;

public class Exercicio40 {

	public static void main(String[] args) {
		
		boolean continuar;
		
		do {
			
			continuar = false;
			
			try {
				
				Double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota: "));
				Double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota: "));
				Double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3° nota: "));
				Double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4° nota: "));
				
				Media media = new Media(nota1, nota2, nota3, nota4);
				Double mediaAluno = media.getMedia();
				
				JOptionPane.showMessageDialog(null,"Média: " + mediaAluno);
				
				if(mediaAluno >= 7.0){
					JOptionPane.showMessageDialog(null,"Aluno Aprovado");
				}else if(mediaAluno < 5.0){
					JOptionPane.showMessageDialog(null,"Aluno Reprovado");
				}else{
					
					double notaExame = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do exame: "));
					
					JOptionPane.showMessageDialog(null,"Aluno em exame");
					JOptionPane.showMessageDialog(null,"Nota do exame: " + notaExame);
					
					double mediaFinal = media.getMediaFinal(mediaAluno,notaExame);
					
					if(mediaFinal >= 5){
						JOptionPane.showMessageDialog(null,"Aluno Aprovado");
					}else{
						JOptionPane.showMessageDialog(null,"Aluno Reprovado");
					}
					
					JOptionPane.showMessageDialog(null,"Média final: " + mediaFinal);
				}
				
			}catch(NotaMediaException e){
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
