package claseEjercicio4v2;

import java.util.Scanner;

public class Calculos {
	private int suma1;
	private int suma2;
	
		public Calculos() {
		super();
	}

	public Calculos(int suma1, int suma2) {
			super();
			this.suma1 = suma1;
			this.suma2 = suma2;
	}
	
	public int pedir() {
		Scanner in = new Scanner(System.in);
		int suma;
		
		System.out.print("Introduce el número: ");
			suma = in.nextInt();
			return suma;
	}
	
	public int Sumar() {
		int resultado;
		resultado = suma1 + suma2;
		return resultado;
	}
	
	public int Restar() {
		int resultado;
		resultado = suma1 - suma2;
		return resultado;
	}
	
	public int Dividir() {
		int resultado;
		resultado = suma1 / suma2;
		return resultado;
	}
	
	public int Multiplicar() {
		int resultado;
		resultado = suma1 * suma2;
		return resultado;
	}
	
	public int getSuma1() {
		return suma1;
	}

	public void setSuma1(int suma1) {
		this.suma1 = suma1;
	}

	public int getSuma2() {
		return suma2;
	}

	public void setSuma2(int suma2) {
		this.suma2 = suma2;
	}

}