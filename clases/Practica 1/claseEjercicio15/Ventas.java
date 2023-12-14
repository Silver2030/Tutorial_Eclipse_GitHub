package claseEjercicio15;

import java.util.Scanner;

public class Ventas {
	private String nombre;
	private int precio;
	private char oferta;
	private int stock;
	
	public Ventas() {
		super();
	}

	public Ventas(String nombre, int precio, char oferta, int stock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.oferta = oferta;
		this.stock = stock;
	}
	
	public int pedirint() {
		Scanner in = new Scanner(System.in);
		int num;
		num = in.nextInt();
		return num;
	}

	public char pedirchar() {
		Scanner in = new Scanner(System.in);
		char num;
		num = in.next().charAt(0);
		return num;
	}
	
	public String pedirString() {
		Scanner in = new Scanner(System.in);
		String num;
		num = in.nextLine();
		return num;
	}
	
	public int pagototal(int cantidad) {
		int total = 0;
		switch (oferta) {
		case 'X':
			total = cantidad * precio - 5;
			break;
		case 'Y':
			total = cantidad * precio - 3;
			break;
		case 'Z':
			total = cantidad * precio - 1;
			break;
		}
		return total;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public char getOferta() {
		return oferta;
	}

	public void setOferta(char oferta) {
		this.oferta = oferta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " Precio: " + precio + " Oferta: " + oferta + " Stock: " + stock;
	}
	
	
	
	
}
