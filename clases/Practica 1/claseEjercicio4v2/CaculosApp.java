package claseEjercicio4v2;

import java.util.Scanner;

public class CaculosApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int suma1, suma2, resultado = 0;
		char app1, respuesta = 'S';
		Calculos obj = new Calculos();
		while(respuesta != 'N') {
		System.out.println("+. Sumar");
		System.out.println("-. Restar");
		System.out.println("/. Dividir");
		System.out.println("*. Multiplicar");
		app1 = in.next().charAt(0);
		while((app1!='+')&&(app1!='-')&&(app1!='/')&&(app1!='*')) {
			System.out.println("Opcion seleccionada invalida, por favor eliga una valida");
			System.out.println("+. Sumar");
			System.out.println("-. Restar");
			System.out.println("/. Dividir");
			System.out.println("*. Multiplicar");
			app1 = in.next().charAt(0);
		}
		suma1 = obj.pedir();
		obj.setSuma1(suma1);
		suma2 = obj.pedir();
		obj.setSuma2(suma2);
		switch(app1) {
		case '+':
			resultado = obj.Sumar();
			System.out.println(obj.getSuma1() + " + " + obj.getSuma2() + " = " + resultado);
			break;
		case '-':
			resultado = obj.Restar();
			System.out.println(obj.getSuma1() + " - " + obj.getSuma2() + " = " + resultado);
			break;
		case '/':
			resultado = obj.Dividir();
			System.out.println(obj.getSuma1() + " / " + obj.getSuma2() + " = " + resultado);
			break;
		case '*':
			resultado = obj.Multiplicar();
			System.out.println(obj.getSuma1() + " * " + obj.getSuma2() + " = " + resultado);
			break;
		}
		
		System.out.print("Continuar (S/N)?: ");
		respuesta = in.next().charAt(0);
		respuesta = Character.toUpperCase(respuesta);
		while(respuesta != 'N' && respuesta !='S') {
            System.out.println("Respuesta invalida, por favor vuelta a intentarlo");
            System.out.print("Continuar (S/N)?: ");
            respuesta = in.next().charAt(0);
            }
		}
		in.close();
	}		

}
