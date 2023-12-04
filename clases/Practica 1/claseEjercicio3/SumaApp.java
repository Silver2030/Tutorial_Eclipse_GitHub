package claseEjercicio3;

import java.util.Scanner;




public class SumaApp {
	static int suma1,suma2;
	static Suma obj = new Suma();

	public static void main(String[] args) {
		pedirDatos();
		mostrar();
	}
		
		public static void pedirDatos() {
			   Scanner in = new Scanner(System.in);
			   
			   obj.pedir();
			   suma1= in.nextInt(); 
			   
			   obj.pedir();
			   suma2 = in.nextInt();
			   in.close();
		}
		
		public static void mostrar() {
			obj.Resultado(suma1, suma2);
			obj.mostrar();
		}
}
