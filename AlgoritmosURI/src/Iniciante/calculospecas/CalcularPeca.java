package Iniciante.calculospecas;

import Iniciante.excecoes.MenorQue0Exception;

public class CalcularPeca {

	private int codPeca;
	private int qtdPeca;
	private double valorPeca;
	
	public CalcularPeca(){
		
	}
	
	public CalcularPeca(int codPeca, int qtdPeca, double valorPeca)throws MenorQue0Exception{
		this.setCodPeca(codPeca);
		this.setQtdPeca(qtdPeca);
		this.setValorPeca(valorPeca);
	}
	
	public void setCodPeca(int codPeca) throws MenorQue0Exception{
		
		if(codPeca < 0){
			throw new MenorQue0Exception();
		}
		
		this.codPeca = codPeca;
	}
	
	public void setQtdPeca(int qtdPeca)throws MenorQue0Exception{
		
		if(qtdPeca < 0){
			throw new MenorQue0Exception();
		}
		
		this.qtdPeca = qtdPeca;
	}
	
	public void setValorPeca(double valorPeca)throws MenorQue0Exception{
		
		if(valorPeca < 0){
			throw new MenorQue0Exception();
		}
		
		this.valorPeca = valorPeca;
	}
	
	
	public double getValor(){
		return valorPeca * qtdPeca;
	}
}
