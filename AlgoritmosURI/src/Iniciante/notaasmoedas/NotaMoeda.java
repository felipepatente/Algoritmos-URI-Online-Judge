package Iniciante.notaasmoedas;

import javax.swing.JOptionPane;

import Iniciante.excecoes.ValorForaDoIntervaloException;

public class NotaMoeda {

	private double valor;
	private int[] cedulas = new int[12];
	
	public NotaMoeda(double valor)throws ValorForaDoIntervaloException{
		this.setValor(valor);
	}
	
	public void setValor(double valor) throws ValorForaDoIntervaloException{
		if(valor < 0 && valor > 1000000){
			throw new ValorForaDoIntervaloException();
		}
		this.valor = valor;
	}
	
	private void contarCedula(){
		
		double valorAux = valor;
		int i = 0;
		
		double[] dinheiro = {100,50,20,10,5,2,1,0.50,0.25,0.10,0.05,0.01};
		
		while(valorAux > 0){
		
			if(valorAux - dinheiro[i] >= 0){
				valorAux -= dinheiro[i];
				cedulas[i]++;
			}else{
				i++;
			}
		
		}
	}
	
	public void imprimir(){
		
		contarCedula();
		
		JOptionPane.showMessageDialog(null, cedulas[0] + " nota(s) de R$ 100,00\n"
				+ cedulas[1] + " nota(s) de R$ 50,00\n"
				+ cedulas[2] + " nota(s) de R$ 20,00\n"
				+ cedulas[3] + " nota(s) de R$ 10,00\n"
				+ cedulas[4] + " nota(s) de R$ 5,00\n"
				+ cedulas[5] + " nota(s) de R$ 2,00\n"
				+ "MOEDAS\n"
				+ cedulas[6] + " nota(s) de R$ 1,00\n"
				+ cedulas[7] + " nota(s) de R$ 0,50\n"
				+ cedulas[8] + " nota(s) de R$ 0,25\n"
				+ cedulas[9] + " nota(s) de R$ 0,10\n"
				+ cedulas[10] + " nota(s) de R$ 0,05\n"
				+ cedulas[11] + " nota(s) de R$ 0,01\n");
	}
}
