package Iniciante.salarios;

public class MenorZeroException  extends Exception {

	public String getMessage(){
		return "Não é permitido números menores ou igual a 0";
	}
	
}
