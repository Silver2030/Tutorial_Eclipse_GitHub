package claseEjercicio8;

import java.util.Scanner;

public class Area {
	private double dato1;
	private double dato2;
	public Area() {
		super();
	}
	public Area(double dato1, double dato2) {
		super();
		this.dato1 = dato1;
		this.dato2 = dato2;
	}
	
	public double pedir() {
		Scanner in = new Scanner(System.in);
		double num;
		
		num = in.nextDouble();
		return num;
	}
	
	public double circulo() {
		double resultado;
		resultado = Math.pow(dato1, 2)* 3.14;
		return resultado;
	}
	
	public double triangulo() {
		double resultado;
		resultado = dato1 * dato2 / 2;
		return resultado;
	}
	
	public double cuadrado() {
		double resultado;
		resultado = dato1 * dato1;
		return resultado;
	}
	
	public double getDato1() {
		return dato1;
	}
	public void setDato1(double dato1) {
		this.dato1 = dato1;
	}
	public double getDato2() {
		return dato2;
	}
	public void setDato2(double dato2) {
		this.dato2 = dato2;
	}
		
}
