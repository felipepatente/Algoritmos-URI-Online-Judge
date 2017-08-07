package Iniciante.equacoes;

import Iniciante.excecoes.DivisaoPor0Exception;

public class Equacao {
	
	private double a;
	private double b;
	private double c;
	
	public Equacao(){
	
	}
	
	public Equacao(double a, double b, double c){
		setarValores(a,b,c);
	}
	
	private void setarValores(double a, double b, double c){
		this.setA(a);
		this.setB(b);
		this.setC(c);
	}
	
	public void setA(double a){
		this.a = a;
	}
	
	public void setB(double b){
		this.b = b;
	}
	
	public void setC(double c){
		this.c = c;
	}
	
	public double getDelta(){
		return calcularDelta();
	}
	
	public double getDelta(double a, double b, double c){
		setarValores(a,b,c);
		return calcularDelta();
	}
	
	private double calcularDelta(){
		return Math.pow(b, 2) - 4 * a * c;
	}
	
	public double getR1()throws DivisaoPor0Exception{
		
		double delta = Math.sqrt(calcularDelta());
		double a = 2 * this.a;
		double b = -this.b;	
		
		if(a == 0){
			throw new DivisaoPor0Exception();
		}
		
		return (b + delta) / a;
		
	}
	
	public double getR2()throws DivisaoPor0Exception{
		
		double delta = Math.sqrt(calcularDelta());
		double a = 2 * this.a;
		double b = -this.b;		
		
		if(a == 0){
			throw new DivisaoPor0Exception();
		}
		
		return (b - delta) / a;
	}
}
