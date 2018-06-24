package Iniciante.coodernadas;

public class Coodernada {
	
	private double x;
	private double y;
	
	
	public Coodernada(double x, double y)throws NumberFormatException{
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
		
	public String getCoodernada(){
	
		String coodernada = "";
		
		if(x == 0 && y == 0){
			coodernada = "Origem";
		}else if(x > 0 && y > 0){
			coodernada = "Q1";
		}else if(x < 0 && y < 0){
			coodernada = "Q3";
		}else if(x > 0 && y < 0){
			coodernada = "Q4";
		}else{
			coodernada = "Q2";
		}
		
		return coodernada;
	}	
}
