package Iniciante.produtos;

public class Produto {
	
	private int num1;
	private int num2;
	
	public void setNum1(int num1){
		this.num1 = num1;
	}
	
	public void setNum2(int num2){
		this.num2 = num2;
	}
	
	public int getProduto(){
		return this.num1 * this.num2;
	}

}
