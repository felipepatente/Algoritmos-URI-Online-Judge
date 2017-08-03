package Iniciante.idadedias;

import Iniciante.excecoes.MenorOuIgual0Exception;

public class Idade {
	
	private int idadeDias;
	
	public Idade(int idadeDias)throws MenorOuIgual0Exception{
		this.setIdadeDias(idadeDias);
	}
	
	public void setIdadeDias(int idadeDias)throws MenorOuIgual0Exception{
		if(idadeDias <= 0){
			throw new MenorOuIgual0Exception();
		}
		
		this.idadeDias = idadeDias;
	}
	
	public int getAnos(){
		return idadeDias / 360;
	}
	
	public int getMeses(){
		return (idadeDias % 360) / 30;
	}
	
	public int getDias(){
		return (idadeDias % 360) % 30 / 2;
	}

}
