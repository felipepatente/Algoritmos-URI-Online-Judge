package Iniciante.areas;

import Iniciante.excecoes.MenorOuIgual0Exception;

public class Geometria {
	
	private double valor1;
	private double valor2;
	private double valor3;
	
	public Geometria(double valor1, double valor2, double valor3)throws MenorOuIgual0Exception{
		this.validarValores(valor1, valor2, valor3);
	}
	
	public void validarValores(double valor1, double valor2, double valor3)throws MenorOuIgual0Exception{
		
		if(valor1 < 0 || valor2 < 0 || valor3 < 0){
			throw new MenorOuIgual0Exception();
		}
		
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
		
	}
	
	public double getTrianguloRetangulo(){
		return (valor1 * valor3) / 2;
	}
	
	public double getCirculo(){
		return Math.pow(valor3, 2) * 3.14159d;
	}
	
	public double getTrapezio(){
		return ((valor1 + valor2) * valor3) / 2;
	}
	
	public double getQuadrado(){
		return Math.pow(valor2, 2);
	}
	
	public double getRetangulo(){
		return valor1 * valor2;
	}
	
}
