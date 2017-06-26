package Iniciante.circulos;

public class Circulo {

	private final double PI = 3.14159d;
	
	public double getArea(double raio) throws Exception{
		this.setRaio(raio);
		return PI * (raio * raio);
	}	
	
	private void setRaio(double raio) throws Exception{
		
		if(raio < 0){
			throw new Exception();
		}
		
	}
}

