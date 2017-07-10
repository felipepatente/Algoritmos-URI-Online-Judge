package Iniciante.salariosBonus;

public class SalarioBonus {
	
	private String nome;
	private double salarioFixo;
	private double totVendas;
	private final double comissao = 0.15d;
	
	public SalarioBonus(String nome){
		this.nome = nome;
	}
	
	public void setSalarioFixo(double salarioFixo) throws MenorQue0Exception {
		
		if(salarioFixo <= 0){
			throw new MenorQue0Exception();
		}
		
		this.salarioFixo = salarioFixo;
	}
	
	public void setTotVendas(double totVendas) throws MenorQue0Exception{
		
		if(totVendas <= 0){
			throw new MenorQue0Exception();
		}
		
		this.totVendas = totVendas;
	}
	
	public double getSalario(){
		return  this.salarioFixo + (this.totVendas * this.comissao);
	}
	
}
