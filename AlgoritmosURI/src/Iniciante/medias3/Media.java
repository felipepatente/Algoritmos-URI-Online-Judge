package Iniciante.medias3;

import Iniciante.excecoes.NotaMediaException;;

public class Media {
	
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	public Media(){
		
	}
	
	public Media(double nota1,double nota2, double nota3, double nota4)throws NotaMediaException{
		this.setNota1(nota1);
		this.setNota2(nota2);
		this.setNota3(nota3);
		this.setNota4(nota4);
	}
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) throws NotaMediaException {
		
		if(nota1 < 0){
			throw new NotaMediaException();
		}
		
		this.nota1 = nota1;
	}
	
	public double getNota2(){		
		return nota2;
	}
	
	public void setNota2(double nota2) throws NotaMediaException{
		
		if(nota2 < 0){
			throw new NotaMediaException();
		}
		
		this.nota2 = nota2;
	}
	
	public double getNota3() {		
		return nota3;
	}
	
	public void setNota3(double nota3) throws NotaMediaException {
		
		if(nota3 < 0){
			throw new NotaMediaException();
		}
		
		this.nota3 = nota3;
	}
	
	public double getNota4() {		
		return nota4;
	}
	
	public void setNota4(double nota4) throws NotaMediaException {
		
		if(nota4 < 0){
			throw new NotaMediaException();
		}
		
		this.nota4 = nota4;
	}

	public double getMedia(){
		return ( (this.nota1 * 2) + (this.nota2 * 3) + (this.nota3 * 4) + (this.nota4 * 1) ) / (2 + 3 + 4 + 1);
	}
	
	
	public double getMediaFinal(double mediaAluno, double notaExame){
		return (mediaAluno + notaExame) / 2;
	}
	
}
