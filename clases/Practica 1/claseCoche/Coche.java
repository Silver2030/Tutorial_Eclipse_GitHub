package claseCoche;

import java.util.Scanner;

public class Coche {
	
	private int ruedas;
	private String color;
	private int peso;
	private int ancho;
	private int largo;
	private String motor;
	
	public Coche() {
		super();
		
	}
	
	public Coche(int ruedas, String color, int peso, int ancho, int largo, String motor) {
		super();
		this.ruedas = ruedas;
		this.color = color;
		this.peso = peso;
		this.ancho = ancho;
		this.largo = largo;
		this.motor = motor;
	}

	public int pedirInt() {
		Scanner in = new Scanner(System.in);
		int int1;
		int1 = in.nextInt();
		return int1;
	}
	
	public String pedirString() {
		Scanner in = new Scanner(System.in);
		String int1;
		int1 = in.nextLine();
		return int1;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return  "Ruedas = " + ruedas + "\n" + 
				"Color = " + color + "\n" + 
				"Peso = " + peso + "\n" +
				"Ancho (cm) = " + ancho + "\n" + 
				"Largo (cm) = " + largo + "\n" + 
				"Motor = " + motor;
	}
	
	
	

}
