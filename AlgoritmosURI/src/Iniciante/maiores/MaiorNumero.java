package Iniciante.maiores;

public class MaiorNumero {
	
	private double num1;
	private double num2;
	private double num3;
	
	public MaiorNumero(double num1, double num2, double num3){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public double getMaior(){
		
		double maior = 0;
		
		if(num1 > num2 && num1 > num3){
			maior = num1;
		}else if(num2 > num3){
			maior = num2;
		}else{
			maior = num3;
		}
		
		return maior;
	}

}
