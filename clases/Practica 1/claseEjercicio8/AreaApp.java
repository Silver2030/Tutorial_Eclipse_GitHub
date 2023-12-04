package claseEjercicio8;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00##");
		char signo;
		Area obj = new Area();
		System.out.println("1. Circulo");
		System.out.println("2. Triangulo");
		System.out.println("3. Cuadrado");
		signo = in.next().charAt(0);
		while((signo != '1')&&(signo != '2')&&(signo != '3')) {
			System.out.println("Signo introducido erroneo, por favor intentelo de nuevo");
			System.out.println("1. Circulo");
			System.out.println("2. Triangulo");
			System.out.println("3. Cuadrado");
			signo = in.next().charAt(0);
		}
		
		switch(signo) {
		case '1':
			System.out.print("Introduce el radio: ");
			obj.setDato1(obj.pedir());
			System.out.println(obj.getDato1() + "^2 * 3,14 = " + df.format(obj.circulo()));
			return;
		case '2':
			System.out.print("Introduce la base: ");
			obj.setDato1(obj.pedir());
			System.out.print("Introduce la altura: ");
			obj.setDato2(obj.pedir());
			System.out.println(obj.getDato1() + " * " + obj.getDato2() + " / 2 = " + df.format(obj.triangulo()));
			return;
		case '3':
			System.out.print("Introduce el lado: ");
			obj.setDato1(obj.pedir());
			System.out.println(obj.getDato1() + " * " + obj.getDato1() + " = " + df.format(obj.cuadrado()));
			return;
		}

	}

}
