package Iniciante.cedulas;

import javax.swing.JOptionPane;
import Iniciante.excecoes.ValorForaDoIntervaloException;

public class Cedula {
	
	private int valor;
	private int[] cedulas = new int[7];
	
	public Cedula(int valor)throws ValorForaDoIntervaloException{
		this.setValor(valor);
	}
	
	public void setValor(int valor) throws ValorForaDoIntervaloException{
		if(valor < 0 && valor > 1000000){
			throw new ValorForaDoIntervaloException();
		}
		this.valor = valor;
	}
	
	private void contarCedula(){
		
		int valorAux = valor;
		
		while(valorAux > 0){
			
			if(valorAux - 100 >= 0){
				valorAux -= 100;
				cedulas[0]++;
			}else if(valorAux - 50 >= 0){
				valorAux -= 50;
				cedulas[1]++;
			}else if(valorAux - 20 >= 0){
				valorAux -= 20;
				cedulas[2]++;
			}else if(valorAux - 10 >= 0){
				valorAux -= 10;
				cedulas[3]++;
			}else if(valorAux - 5 >= 0){
				valorAux -= 5;
				cedulas[4]++;
			}else if(valorAux - 2 >= 0){
				valorAux -= 2;
				cedulas[5]++;
			}else if(valorAux - 1 >= 0){
				valorAux -= 1;
				cedulas[6]++;
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
				+ cedulas[6] + " nota(s) de R$ 1,00\n");		
	}
}