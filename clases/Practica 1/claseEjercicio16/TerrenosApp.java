package claseEjercicio16;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TerrenosApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Terrenos obj = new Terrenos();
		char c = 'S';
		
		do {
			System.out.print("Introduce la forma del terreno (Cuadrado/Circular): ");
			obj.setForma(obj.pedirtexto());
			while((!obj.getForma().toUpperCase().equals("CUADRADO"))&&(!obj.getForma().toUpperCase().equals("CIRCULAR"))) {
				System.out.print("Forma introducida erronea (Cuadrado/Circular): ");
				obj.setForma(obj.pedirtexto()); /* Validar que la respuesta solo sea cuadrado o circulo */
			}
			
			System.out.print("Introduce la medida del terreno (m2): ");
			obj.setMedida(obj.pedirnumint());
			while(obj.getMedida()<0) {
				System.out.print("Medida introducida erronea, introduce un número entero: ");
				obj.setMedida(obj.pedirnumint()); /* Validar que no pueda meter números negativos */
			}
			
			System.out.print("Introduce el valor por m2: ");
			obj.setValorm2(obj.pedirnumdouble());
			while(obj.getValorm2()<0) {
				System.out.print("Valor introducido erroneo, introduce un número entero: ");
				obj.setValorm2(obj.pedirnumdouble()); /* Validar que no pueda meter números negativos */
			}
			
			obj.descuento();
			
			System.out.println();
			System.out.println(obj.toString()); /* Mostrar los datos del terreno */
			
			System.out.println();
			
			System.out.print("Quieres continuar con el programa? (S/N): ");
			c = in.next().charAt(0); /* Confirmar si se quiere finalizar o continuar con el programa */
			c = Character.toUpperCase(c);
			while((c != 'S')&&(c != 'N')){
				System.out.println();
				System.out.println("Respuesta invalida, por favor vuelva a intentarlo");
				System.out.print("Quieres continuar con el programa? (S/N): ");
				c = in.next().charAt(0);
				c = Character.toUpperCase(c);
			}
			System.out.println();
		}while(c != 'N');

	}

}
