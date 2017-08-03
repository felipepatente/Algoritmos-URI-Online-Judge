package Iniciante.excecoes;

public class ValorForaDoIntervaloException extends Exception {

	public String getMessage(){
		return "Digite números maiores que 0 que menores que 1000000";
	}
}
