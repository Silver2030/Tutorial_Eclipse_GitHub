package claseEjercicio4;

import java.util.Scanner;

public class CalculosApp {
	static int suma1,suma2;
	static char app1;
	static Calculos obj = new Calculos();

	public static void main(String[] args) {
		elegir();
		pedirDatos();
		switch(app1) {
		case '1':
			mostrarSumar();
			break;
		case '2':
			mostrarRestar();
			break;
		case '3':
			mostrarDividir();
			break;
		case '4':
			mostrarMultiplicacion();
			break;
		}
	}
		public static void elegir() {
			Scanner in = new Scanner(System.in);
			
			obj.Elegir();
			app1 = in.next().charAt(0);
			while((app1!='1')&&(app1!='2')&&(app1!='3')&&(app1!='4')) {
				obj.error();
				obj.Elegir();
				app1 = in.next().charAt(0);
			}

		}	

		public static void pedirDatos() {
			Scanner in = new Scanner(System.in);
			
			   obj.pedir();
			   suma1 = in.nextInt();
			   
			   obj.pedir();
			   suma2 = in.nextInt();
			   in.close();
		}
		
		public static void mostrarSumar() {
			obj.Sumar(suma1, suma2);
			obj.MostrarSumar();
		}
		
		public static void mostrarRestar() {
			obj.Restar(suma1, suma2);
			obj.MostrarRestar();
		}
		
		public static void mostrarDividir() {
			obj.Dividir(suma1, suma2);
			obj.MostrarDividir();
		}
		
		public static void mostrarMultiplicacion() {
			obj.Multiplicacion(suma1, suma2);
			obj.MostrarMultiplicacion();
		}

}
