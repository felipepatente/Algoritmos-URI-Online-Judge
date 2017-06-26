package Iniciante.medias;

public class Media {
	
	private double nota1;
	private double nota2;
	private final double PESO1 = 3.5d;
	private final double PESO2 = 7.5d;
	
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

	
	public double getMedia(){
		return ((nota1 * PESO1) + (nota2  * PESO2)) / (PESO1 + PESO2);
	}

}
