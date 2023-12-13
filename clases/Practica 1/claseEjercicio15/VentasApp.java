package claseEjercicio15;

import claseEjercicio1.Persona;

public class VentasApp {

	public static void main(String[] args) {
		Ventas obj = new Ventas();
		int n;
		char v = 'S';
		
		System.out.print("Introduce cantidad de productos que se quiere registrar:");
		n = obj.pedirint();
		
		for(int i = 0; i < n; i++)
			Ventas ven[i] = new Ventas();
		do {
		
		}while (v != 'N');

	}

}
