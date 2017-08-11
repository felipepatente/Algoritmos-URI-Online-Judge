package Iniciante.intervalos;

public class Intervalo {
	
	private double numero;
	
	public Intervalo(double numero){
		this.setNumero(numero);
	}
	
	public Intervalo(){
		
	}
	
	public void setNumero(double numero){
		this.numero = numero;
	}
	
	
	
	
	
	public String getIntervalo(){
		return verIntervalo();
	}
	
	public String getIntervalo(int numero){
		return verIntervalo();
	}
	
	private String verIntervalo(){
		
		String intervalo = "Fora de Intervalo";
		
		if(numero >= 0 && numero <= 25){
			intervalo = "Intervalo [0,25]";
		}else if(numero > 25 && numero <= 50){
			intervalo = "Intervalo (25,50]";
		}else if(numero > 50 && numero <= 75){
			intervalo = "Intervalo (50,75]";
		}else if(numero > 75 && numero <= 100){
			intervalo = "Intervalo (75,100]";
		}

		return intervalo;
	}
}
