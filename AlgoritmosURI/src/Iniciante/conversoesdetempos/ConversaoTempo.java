package Iniciante.conversoesdetempos;

import Iniciante.excecoes.MenorOuIgual0Exception;

public class ConversaoTempo {
	
	private int tempo;
	
	public ConversaoTempo(int tempo)throws MenorOuIgual0Exception{
		this.setTempo(tempo);
	}
	
	public void setTempo(int tempo)throws MenorOuIgual0Exception{
		
		if(tempo <= 0){
			throw new MenorOuIgual0Exception();
		}
		this.tempo = tempo;
	}
	
	public int getHoras(){
		return tempo / 3600;
	}
	
	public int getMinutos(){
		return (tempo % 3600) / 60;
	}

	public int getSegundos(){
		return (tempo % 3600) % 60;
	}
}
