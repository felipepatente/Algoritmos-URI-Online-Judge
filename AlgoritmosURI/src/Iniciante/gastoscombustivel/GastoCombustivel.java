package Iniciante.gastoscombustivel;

import Iniciante.excecoes.MenorOuIgual0Exception;

public class GastoCombustivel {
	
	private double tempo;
	private double velocidade;
	private final double KILOMETRO = 12D;
	
	public GastoCombustivel(double tempo, double velocidade)throws MenorOuIgual0Exception{
		this.setarValores(tempo, velocidade);
	}
	
	public GastoCombustivel(){	
	}
	
	public void setTempo(double tempo)throws MenorOuIgual0Exception{
		
		if(tempo <= 0){
			throw new MenorOuIgual0Exception();
		}
		
		this.tempo = tempo;
	}
	
	public void setVelocidade(double velocidade)throws MenorOuIgual0Exception{
		
		if(velocidade <= 0){
			throw new MenorOuIgual0Exception();
		}
		
		this.velocidade = velocidade;
	}

	public void setarValores(double tempo, double velocidade)throws MenorOuIgual0Exception{
		this.setTempo(tempo);
		this.setVelocidade(velocidade);
	}
	
	public double getQuantidadeLitros(){
		return calcularQuantidadeLitros();
	}
	
	public double getQuantidadeLitros(double tempo, double velocidade)throws MenorOuIgual0Exception{
		this.setarValores(tempo, velocidade);
		return calcularQuantidadeLitros();
	}
	
	private double calcularQuantidadeLitros(){
		return (velocidade / KILOMETRO) * tempo;
	}
}
