package endes;

import java.util.Scanner;

public class SumaNumeros {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, resultado;
		
		System.out.print("Introduce el primer n�mero: ");
		num1 = in.nextInt();
		
		System.out.print("Introduce el segundo n�mero: ");
		num2 = in.nextInt();
		
		num1 += num2;
		
		System.out.println();
		
		System.out.println("La suma de los n�meros introducidos es " + num1);
		
		
	}
}
