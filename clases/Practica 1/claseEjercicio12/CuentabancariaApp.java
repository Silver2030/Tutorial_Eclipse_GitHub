package claseEjercicio12;

import java.util.Scanner;

public class CuentabancariaApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char c = 'S';
		int b = 0;
		Cuentabancaria obj = new Cuentabancaria();
		Cuentabancaria cb1, cb2;
		cb1 = new Cuentabancaria(); 
		cb2 = new Cuentabancaria();
		cb1.setCodigo("8392742148");
		cb2.setCodigo("8392742149");
		
		System.out.print("Introduzca el nombre del titular: ");
		cb1.setNombre(obj.pedirstring());
		
		System.out.print("Introduzca el saldo de la cuenta: ");
		cb1.setSaldo(obj.pedirint());
		
		System.out.println("Cuenta creada exitosamente");
		System.out.println();
		
		System.out.print("Introduzca el nombre del titular: ");
		cb2.setNombre(obj.pedirstring());
		
		System.out.print("Introduzca el saldo de la cuenta: ");
		cb2.setSaldo(obj.pedirint());
		
		System.out.println("Cuenta creada exitosamente");
		System.out.println();
		
		while(c != 'N') {
			System.out.println("1." + cb1.toString());
			System.out.println("2." + cb2.toString());
			System.out.print("Que cuenta deseas gestionar?: ");
			b = obj.pedirint();
			while((b != 1)&&(b != 2)) {
				System.out.println();
				System.out.println("Valor introducido incorrecto, por favor vuelva a intentarlo");
				System.out.println("1." + cb1.toString());
				System.out.println("2." + cb2.toString());
				System.out.print("Que cuenta deseas gestionar?: ");
				b = obj.pedirint();
			}
			if(b == 1) {
				System.out.println("1.Ingresar Fondos");
				System.out.println("2.Retirar Fondos");
				b = obj.pedirint();
				while((b != 1)&&(b != 2)) {
					System.out.println();
					System.out.println("Valor introducido incorrecto, por favor vuelva a intentarlo");
					System.out.println("1.Ingresar Fondos");
					System.out.println("2.Retirar Fondos");
					b = obj.pedirint();
				}
				if(b == 1) {
					System.out.print("Introduzca la cantidad deseada a ingresar: ");
					b = obj.pedirint();
					cb1.setSaldo(cb1.getSaldo() + b);
					System.out.println("Los fondos han sido exitosamente añadidos, saldo actualizado: " + cb1.getSaldo());
				}else {
					System.out.print("Introduzca la cantidad deseada a retirar: ");
					b = obj.pedirint();
					if((obj.retirar(cb1.getSaldo(), b)) == true) {
						cb1.setSaldo(cb1.getSaldo() - b);
						System.out.println("Los fondos han sido exitosamente retirados, saldo actualizado: " + cb1.getSaldo());
					}else {
						System.out.println("Los fondos a retirar superan a la cantidad en la cuenta, por favor cambie la cantidad a retirar");
					}
				}
			}else {
				System.out.println("1.Ingresar Fondos");
				System.out.println("2.Retirar Fondos");
				b = obj.pedirint();
				while((b != 1)&&(b != 2)) {
					System.out.println();
					System.out.println("Valor introducido incorrecto, por favor vuelva a intentarlo");
					System.out.println("1.Ingresar Fondos");
					System.out.println("2.Retirar Fondos");
					b = obj.pedirint();
				}
				if(b == 1) {
					System.out.print("Introduzca la cantidad deseada a ingresar: ");
					b = obj.pedirint();
					cb2.setSaldo(cb2.getSaldo() + b);
					System.out.println("Los fondos han sido exitosamente añadidos, saldo actualizado: " + cb2.getSaldo());
				}else {
					System.out.print("Introduzca la cantidad deseada a retirar: ");
					b = obj.pedirint();
					if((obj.retirar(cb2.getSaldo(), b)) == true) {
						cb2.setSaldo(cb2.getSaldo() - b);
						System.out.println("Los fondos han sido exitosamente retirados, saldo actualizado: " + cb2.getSaldo());
					}else {
						System.out.println("Los fondos a retirar superan a la cantidad en la cuenta, por favor cambie la cantidad a retirar");
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
		System.out.println("FIN PROGRAMA");
		in.close();
	}

}