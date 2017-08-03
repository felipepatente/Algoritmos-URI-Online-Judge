package Iniciante.consumos;

import Iniciante.excecoes.MenorQue0Exception;

public class Consumo {
	
	private double combustivel;
	private double distancia;
	
	public Consumo(){
		
	}
	
	public Consumo(double distancia, double combustivel)throws MenorQue0Exception{
		this.setCombustivel(combustivel);
		this.setDistancia(distancia);
	}
	
	public void setCombustivel(double combustivel)throws MenorQue0Exception{
		
		if(combustivel <= 0){
			throw new MenorQue0Exception();
		}
		
		this.combustivel = combustivel;
	}
	
	public void setDistancia(double distancia)throws MenorQue0Exception{
		
		if(distancia <= 0){
			throw new MenorQue0Exception();
		}
		
		this.distancia = distancia;
	}
	
	public double getConsumoMedio(){
		return distancia/combustivel;
	}
	
	
	public double getConsumoMedio(double distancia, double combustivel)throws MenorQue0Exception{
		
		if(distancia < 0 || combustivel < 0){
			throw new MenorQue0Exception();
		}
		
		return distancia/combustivel;
	}
	
}
