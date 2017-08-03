package Iniciante.distanciascarros;

import Iniciante.excecoes.MenorOuIgual0Exception;

public class DistanciaCarro {
	
	private double distancia;
	private final double MINUTOPORKM = 2d;
	
	public DistanciaCarro(){
		
	}
	
	public DistanciaCarro(double distancia)throws MenorOuIgual0Exception{
		this.setDistancia(distancia);
	}
	
	public void setDistancia(double distancia) throws MenorOuIgual0Exception{
		if(distancia <= 0){
			throw new MenorOuIgual0Exception();
		}
		this.distancia = distancia;
	}
	
	public double getMinutos(){
		return getDistanciaMinutos();
	}
	
	public double getMinutos(double distancia)throws MenorOuIgual0Exception{
		this.setDistancia(distancia);
		return getDistanciaMinutos();
	}
	
	private double getDistanciaMinutos(){
		return this.distancia * this.MINUTOPORKM;
	}

}
