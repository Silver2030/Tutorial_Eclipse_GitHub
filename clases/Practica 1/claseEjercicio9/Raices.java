package claseEjercicio9;

import java.util.Scanner;

public class Raices {
	private double a;
	private double b;
	private double c;
	
	public Raices() {
		super();
	}
	
	public Raices(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double pedir() {
		Scanner in = new Scanner(System.in);
		double valor;
		
		valor = in.nextDouble();
		return valor;
	}
	
	public double discriminante() {
		double resultado;
		
		resultado = Math.pow(b, 2)-(4*a*c);		
		return resultado;
	}
	
	public double formulanegativa(double resultado) {
		double resul;
		
		resul = ((-b - Math.sqrt(resultado))/(2*a));		
		return resul;
	}
	
	public double formulapositiva(double resultado) {
		double resul;
		
		resul = ((-b + Math.sqrt(resultado))/(2*a));		
		return resul;
	}
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	
	

}
