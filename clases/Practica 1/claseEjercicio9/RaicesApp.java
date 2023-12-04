package claseEjercicio9;

import java.util.Scanner;

public class RaicesApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double resultado = 0;
		Raices obj = new Raices();
		
		System.out.print("Introduce el valor de a: ");
		obj.setA(obj.pedir());
		System.out.print("Introduce el valor de b: ");
		obj.setB(obj.pedir());
		System.out.print("Introduce el valor de c: ");
		obj.setC(obj.pedir());
		
		resultado = obj.discriminante();
		System.out.println("El valor del discriminante es de: " + resultado);
		
		System.out.println();
		if(resultado > 0) {
			System.out.println("El valor del discriminante es mayor que 0, habra dos raices reales diferentes");
			System.out.println();
			
			System.out.println("x1 = " + (obj.formulapositiva(resultado)));
			
			System.out.println("x2 = " + (obj.formulanegativa(resultado)));
		}
		if(resultado < 0) System.out.println("El valor del discriminante es menor que 0, habra dos raices complejas diferentes");
		if(resultado == 0) {
			System.out.println("El valor del discriminante es igual que 0, habra dos raices reales iguales");

			System.out.println("x1 = " + (obj.formulapositiva(resultado)));
			System.out.println("x2 = " + (obj.formulanegativa(resultado)));
			
		}
		in.close();
	}

}
