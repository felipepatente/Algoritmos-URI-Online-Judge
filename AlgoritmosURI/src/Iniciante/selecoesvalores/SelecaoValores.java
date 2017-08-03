package Iniciante.selecoesvalores;

public class SelecaoValores {
	
	private int a;
	private int b;
	private int c;
	private int d;
	
	public SelecaoValores(){
		
	}
	
	public SelecaoValores(int a, int b, int c, int d){
		this.setA(a);
		this.setB(b);
		this.setC(c);
		this.setD(d);
	}

	public void setA(int a){
		this.a = a;
	}
	
	public void setB(int b){
		this.b = b;
	}
	
	public void setC(int c){
		this.c = c;
	}
	
	public void setD(int d){
		this.d = d;
	}
	
	public boolean EhAceito(){
		
		if(b > c && d > a && (c + d ) > (a + b) && c > 0 && d > 0 && a % 2 == 0){
			return true;
		}
		
		return false;
	}
	
}
