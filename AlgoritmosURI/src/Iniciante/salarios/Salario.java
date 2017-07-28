package Iniciante.salarios;

public class Salario {
	
	private int numero;
	private double horasTrabalhadas;
	private double valorHora;
	
	public Salario(){
		
	}
	
	public Salario(int numero, double horasTrabalhadas, double valorHora) throws MenorZeroException{
		setNumero(numero);
		setHorasTrabalhadas(horasTrabalhadas);
		setValorHora(valorHora);
	}
	
	public void setNumero(int numero) throws MenorZeroException {
		
		if(numero <= 0){
			throw new MenorZeroException();
		}
		
		this.numero = numero;
		
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setHorasTrabalhadas(double horasTrabalhadas) throws MenorZeroException {
		
		if(horasTrabalhadas <= 0){
			throw new MenorZeroException();
		}
		
		this.horasTrabalhadas = horasTrabalhadas;
		
	}

	
	public void setValorHora(double valorHora) throws MenorZeroException {
		
		if(valorHora <= 0){
			throw new MenorZeroException();
		}
		this.valorHora = valorHora;
	}
	
	public double getSalario(){
		return this.valorHora * this.horasTrabalhadas;
	}
}
