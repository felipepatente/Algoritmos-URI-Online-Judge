package Iniciante.calculospecas;

import Iniciante.excecoes.MenorOuIgual0Exception;

public class CalcularPeca {

	private int codPeca;
	private int qtdPeca;
	private double valorPeca;
	
	public CalcularPeca(){
		
	}
	
	public CalcularPeca(int codPeca, int qtdPeca, double valorPeca)throws MenorOuIgual0Exception{
		this.setCodPeca(codPeca);
		this.setQtdPeca(qtdPeca);
		this.setValorPeca(valorPeca);
	}
	
	public void setCodPeca(int codPeca) throws MenorOuIgual0Exception{
		
		if(codPeca < 0){
			throw new MenorOuIgual0Exception();
		}
		
		this.codPeca = codPeca;
	}
	
	public void setQtdPeca(int qtdPeca)throws MenorOuIgual0Exception{
		
		if(qtdPeca < 0){
			throw new MenorOuIgual0Exception();
		}
		
		this.qtdPeca = qtdPeca;
	}
	
	public void setValorPeca(double valorPeca)throws MenorOuIgual0Exception{
		
		if(valorPeca < 0){
			throw new MenorOuIgual0Exception();
		}
		
		this.valorPeca = valorPeca;
	}
	
	
	public double getValor(){
		return valorPeca * qtdPeca;
	}
}
