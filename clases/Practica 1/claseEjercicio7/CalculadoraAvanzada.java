package claseEjercicio7;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CalculadoraAvanzada {
	private int num1;
	private int num2;
	
	public CalculadoraAvanzada() {
		super();
	}
	
	public CalculadoraAvanzada(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int pedir() {
		Scanner in = new Scanner(System.in);
		int suma;
		
		String texto=JOptionPane.showInputDialog("Escribe el operando prueba: ");
			suma = Integer.parseInt(texto);
			return suma;
	}
	
	public int Sumar() {
		int resultado;
		resultado = num1 + num2;
		return resultado;
	}
	
	public int Restar() {
		int resultado;
		resultado = num1 - num2;
		return resultado;
	}
	
	public int Dividir() {
		int resultado;
		resultado = num1 / num2;
		return resultado;
	}
	
	public int Multiplicar() {
		int resultado;
		resultado = num1 * num2;
		return resultado;
	}
	
	public int Potencia() {
		int resultado = 1;
		for(int i = 1; i <= num2; i++) {
			resultado*= num1;
		}
		return resultado;
	}
	
	public int Resto() {
		int resultado;
		resultado = num1 % num2;
		return resultado;
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	

}
