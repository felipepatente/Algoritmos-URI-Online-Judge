package Iniciante.esferas;
import java.util.InputMismatchException;
import java.util.Scanner;

import Iniciante.excecoes.MenorQue0Exception;
import Iniciante.utilidades.Util;
public class Exercicio11 {
		
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Digite o valor do raio: ");
			double raio = sc.nextDouble();
			
			Esfera esfera = new Esfera();
			esfera.setRaio(raio);
			
			System.out.printf("VOLUME = %.3f ", esfera.getVolume());
			
		}catch (InputMismatchException e) {
			
			Util util = new Util();
			System.out.println(util.getMensagemInput());
			
		}catch (MenorQue0Exception e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
	}
	
}
/*
 * Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o 
 * valor de seu raio (R). A fórmula para calcular o volume é: (4/3) * pi * R3. 
 * Considere (atribua) para pi o valor 3.14159.*/
 