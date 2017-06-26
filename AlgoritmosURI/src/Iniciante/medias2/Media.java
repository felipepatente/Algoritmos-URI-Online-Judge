package Iniciante.medias2;

public class Media {
	
	private double nota1;
	private double nota2;
	private double nota3;
	private final double PESO1 = 2.0d;
	private final double PESO2 = 3.0d;
	private final double PESO3 = 5.0d;
	
	public void setNota1(double nota1) throws Exception{
		
		if(nota1 < 0 && nota1 > 10){
			throw new Exception();
		}
		
		this.nota1 = nota1;
	}
	
	public void setNota2(double nota2) throws Exception{
		
		if(nota2 < 0 && nota2 > 10){
			throw new Exception();
		}
		
		this.nota2 = nota2;
	}
	
	public void setNota3(double nota3) throws Exception{
		
		if(nota3 < 0 && nota3 > 10){
			throw new Exception();
		}
		
		this.nota3 = nota3;
	}
	
	public double getMedia(){
		return ((nota1 * PESO1) + (nota2  * PESO2) + (nota3 * PESO3)) / (PESO1 + PESO2 + PESO3);
	}


}
