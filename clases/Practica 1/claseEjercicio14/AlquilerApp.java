package claseEjercicio14;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AlquilerApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Alquiler obj = new Alquiler();
		ArrayList<Double> total = new ArrayList<>();
		DecimalFormat df = new DecimalFormat("0.00##");
		char c = 'S';
		
		
		while(c != 'N'){
		System.out.print("Introduce los km viajados: ");
		obj.setKm(obj.pedir());
		
		System.out.println();
		total.add(obj.pago());
		
		System.out.print("Quieres continuar con el programa? (S/N): ");
		c = in.next().charAt(0);
		c = Character.toUpperCase(c);
		while((c != 'S')&&(c != 'N')){
			System.out.println();
			System.out.println("Respuesta invalida, por favor vuelva a intentarlo");
			System.out.print("Quieres continuar con el programa? (S/N): ");
			c = in.next().charAt(0);
			c = Character.toUpperCase(c);
		}
		}
		System.out.println();
		for (int i = 0; i < total.size(); i++) {
		    System.out.println("La cantidad final a abonar del cliente número " + i + " sera de " + df.format(total.get(i)));
		}
		in.close();
	}

}
