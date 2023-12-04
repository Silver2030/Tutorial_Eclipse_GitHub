package claseEjercicio11;

import java.util.Scanner;

public class LibroApp {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int b;
		char c = 'S';
		Libro libro1, libro2, obj;
		obj = new Libro();
		libro1 = new Libro("El Quijote","Cervantes", 1, 0);
		libro2 = new Libro();
		libro2.setPrestamos(0);
		
		System.out.print("Introduce el nombre del libro: ");
		libro2.setTitulo(obj.pedirString());
		
		System.out.print("Introduce el nombre del autor: ");
		libro2.setAutor(obj.pedirString());
		
		System.out.print("Introduce el número de copias: ");
		libro2.setLibros(obj.pedirint());
		
		while(c != 'N') {
		System.out.println("1."+libro1.toString());
		System.out.println("2."+libro2.toString());
		System.out.print("Que libro deseas administrar: ");
		b = obj.pedirint();
		while((b != 1)&&(b != 2)) {
			System.out.println();
			System.out.println("Valor introducido incorrecto, por favor vuelva a intentarlo");
			System.out.println("1."+libro1.toString());
			System.out.println("2."+libro2.toString());
			System.out.print("Que libro deseas administrar: ");
			b = obj.pedirint();
		}
		
		if (b == 1) {
			System.out.println("1.Devolver");
			System.out.println("2.Pedir Prestado");
			b = obj.pedirint();
			while((b != 1)&&(b != 2)) {
				System.out.println();
				System.out.println("Valor introducido incorrecto, por favor vuelva a intentarlo");
				System.out.println(libro1.toString());
				System.out.println("1.Devolver");
				System.out.println("2.Pedir Prestado");
				b = obj.pedirint();
			}
			if(b == 1) {
				if(obj.devolver(libro1.getLibros(), libro1.getPrestamos()) == true) {
					System.out.println("Gracias por devolver la copia del libro");
					libro1.setPrestamos(libro1.getPrestamos() - 1);
					libro1.setLibros(libro1.getLibros() + 1);
				}else {
					System.out.println("No se detecta ninguna copia prestada de este libro, por favor vuelva a intentarlo más tarde.");
				}
			}else {
				if(obj.prestar(libro1.getLibros(), libro1.getPrestamos()) == true) {
					System.out.println("Recuerde devolver la copia del libro en las mismas condiciones");
					libro1.setPrestamos(libro1.getPrestamos() + 1);
					libro1.setLibros(libro1.getLibros() - 1);
				}else {
					System.out.println("Hay más copias prestadas que disponibles, no se puede prestar más copias");
				}
			}
			
		}else {
			System.out.println("1.Devolver");
			System.out.println("2.Pedir Prestado");
			b = obj.pedirint();
			while((b != 1)&&(b != 2)) {
				System.out.println();
				System.out.println("Valor introducido incorrecto, por favor vuelva a intentarlo");
				System.out.println(libro2.toString());
				System.out.println("1.Devolver");
				System.out.println("2.Pedir Prestado");
				b = obj.pedirint();
			}
			if(b == 1) {
				if(obj.devolver(libro2.getLibros(), libro2.getPrestamos()) == true) {
					System.out.println("Gracias por devolver la copia del libro");
					libro2.setPrestamos(libro2.getPrestamos() - 1);
					libro2.setLibros(libro2.getLibros() + 1);
				}else{
					System.out.println("No se detecta ninguna copia prestada de este libro, por favor vuelva a intentarlo más tarde.");
				}
			}else {
				if(obj.prestar(libro2.getLibros(), libro2.getPrestamos()) == true)  {
					System.out.println("Recuerde devolver la copia del libro en las mismas condiciones");
					libro2.setPrestamos(libro2.getPrestamos() + 1);
					libro2.setLibros(libro2.getLibros() - 1);
				}else {
					System.out.println("Hay más copias prestadas que disponibles, no se puede prestar más copias");
				}
			}
		}
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
		System.out.println();
		}
		System.out.print("FIN PROGRAMA");
		in.close();
	}

}
