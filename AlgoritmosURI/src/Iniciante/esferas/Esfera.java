package Iniciante.esferas;

import Iniciante.excecoes.MenorQue0Exception;;

public class Esfera {

	private double raio;
	private final double PI = 3.14159;
	
	public Esfera(double raio)throws MenorQue0Exception{
		this.setRaio(raio);
	}
	
	public Esfera(){
		
	}
	
	public void setRaio(double raio) throws MenorQue0Exception{
		
		if(raio < 0){
			throw new MenorQue0Exception();
		}
		
		this.raio = raio;
	}
	
	public double getVolume(){
		return (4.0 / 3.0) * PI * Math.pow(raio, 3);
	}
}

