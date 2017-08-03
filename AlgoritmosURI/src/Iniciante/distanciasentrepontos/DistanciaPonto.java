package Iniciante.distanciasentrepontos;

public class DistanciaPonto {
	
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	
	public DistanciaPonto(){
		
	}
	
	public DistanciaPonto(double x1, double y1, double x2, double y2){
		this.setarCampos(x1,y1,x2,y2);
	}
	
	public void setX1(double x1){
		this.x1 = x1;
	}
	
	public void setY1(double y1){
		this.y1 = y1;
	}

	public void setX2(double x2){
		this.x2 = x2;
	}
	
	public void setY2(double y2){
		this.y2 = y2;
	}
	
	public double getDistanciaEntrePontos(){
		
		double ponto1 = Math.pow(x1 - x2, 2);
		double ponto2 = Math.pow(y1 - y2, 2);
		double distancia = Math.sqrt(ponto1 + ponto2);
		
		return distancia;
	}
	
	public double getDistanciaEntrePontos(double x1, double y1, double x2, double y2){
		
		this.setarCampos(x1,y1,x2,y2);
		double ponto1 = Math.pow(x1 - x2, 2);
		double ponto2 = Math.pow(y1 - y2, 2);
		double distancia = Math.sqrt(ponto1 + ponto2);
		
		return distancia;
	}
	
	private void setarCampos(double x1, double y1, double x2, double y2){
		this.setX1(x1);
		this.setY1(y1);
		this.setX2(x2);
		this.setY2(y2);
	}
}
