package Iniciante.lanches;

import Iniciante.excecoes.ValorForaDoIntervaloException;

public class Lanche {
	
	private int codigo;
	private int quantidade;
	
	public Lanche(int codigo, int quantidade) throws ValorForaDoIntervaloException{

		if(codigo < 1 || codigo > 5){
			throw new ValorForaDoIntervaloException();
		}
		
		this.codigo = codigo;
		this.quantidade = quantidade;
	}
	
	public double getTotal(){
		
		double[] valores = {4d, 4.5d, 5d, 2d, 1.5d};
		
		return valores[codigo - 1] * quantidade;
	}

}
