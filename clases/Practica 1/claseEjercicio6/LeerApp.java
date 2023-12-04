package claseEjercicio6;

import java.util.Scanner;

public class LeerApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Leer obj = new Leer();
		char respuesta = 'S';
		
		while(respuesta != 'N') {
		obj.setNum(obj.pedir());
		if(obj.esPar()==true) 
			System.out.println("Es par");
		else 
			System.out.println("Es impar");
		if(obj.multi5()==true) 
			System.out.println("Es multiplo de 5");
		else 
			System.out.println("No es multiplo de 5");
		if(obj.perfecto()==true) 
			System.out.println("Es un número perfecto");
		else 
			System.out.println("No es un número perfecto");
		
		System.out.print("Continuar (S/N)?: ");
		respuesta = in.next().charAt(0);
		respuesta = Character.toUpperCase(respuesta);
		while(respuesta != 'N' && respuesta !='S') {
            System.out.println("Respuesta invalida, por favor vuelta a intentarlo");
            System.out.print("Continuar (S/N)?: ");
            respuesta = in.next().charAt(0);
            }
		}

	}

}
