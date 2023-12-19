package claseEjercicio15;

import java.util.Scanner;

public class VentasApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int u, n = -1, c = 1, p, z, q;
		String res, apo;
		System.out.print("Introduce cantidad de productos que se quiere registrar: ");
		u = in.nextInt();
		System.out.println();
		Ventas obj[]=new Ventas[u];
		
		for(int i = 0; i < obj.length; i++) obj[i]=new Ventas(); 
		
		for(int i = 0; i < obj.length; i++) { /* Introducir los datos de todos los artículos a crear */
			System.out.print("Nombre del artículo Nº" + c + ": ");
			obj[i].setNombre(obj[i].pedirString());
			
			System.out.print("Precio del artículo Nº" + c + ": ");
			obj[i].setPrecio(obj[i].pedirint());
			
			System.out.print("Oferta del artículo Nº" + c + ": ");
			obj[i].setOferta(Character.toUpperCase(obj[i].pedirchar()));
			while((obj[i].getOferta() != 'X')&&(obj[i].getOferta() != 'Y')&&(obj[i].getOferta() != 'Z')) {
				System.out.print("Valor de oferta del artículo introducido erroneo, vuelva a intentarlo: ");
				obj[i].setOferta(Character.toUpperCase(obj[i].pedirchar()));
			}
			
			System.out.print("Stock del artículo Nº" + c + ": ");
			obj[i].setStock(obj[i].pedirint());
			
			System.out.println();
			c++;
		}
		
		do {
			c = 1;
			for(int i = 0; i < obj.length; i++) { /* Mostrar todos los artículos y sus datos */
				System.out.println("Árticulo Nº" + c +") " + obj[i].toString());
				c++;
			}
			
		
		System.out.println(); 
		System.out.println("1. Venta");
		System.out.println("2. Compra");
		System.out.println("3. Salir");
		System.out.print("Que desea realizar: ");
		z = in.nextInt();
		
		switch (z) {
			case 1:
				in.nextLine();
				System.out.println();
				while(n == -1) {
				System.out.print("Árticulo vendido: ");
				res = in.nextLine();
				System.out.println();
				for(int i = 0; i < obj.length; i++) { /* Compara String ingresado con todos los nombres de artículos
				registrados */
						if(res.toUpperCase().equals(obj[i].getNombre().toUpperCase())) n = i;
				}
				if(n == -1) System.out.println(n + "Nombre introducido erroneo");
				}
					
				System.out.print("Cantidad vendida: ");
				c = in.nextInt();
				System.out.println();
					
				if(c <= obj[n].getStock()) { /* Validar que la cantidad a vender sea inferior o igual al stock disponible */
					System.out.println("Total a pagar: " + obj[n].pagototal(c));
					System.out.print("Ingrese el pago realizado: ");
					p = in.nextInt();
					while(p < obj[n].pagototal(c)) { /* Validar que el pago sea igual o superior a la cantidad a pagar */
						System.out.print("El pago realizado es insuficiente, pago: " + obj[n].pagototal(c) + ": ");
						p = in.nextInt();
					}
					System.out.println();
					obj[n].setStock(obj[n].getStock() - c); /* Reducir el stock del artículo seleccionado */
					cambio_optimo(p, obj[n].pagototal(c)); /* Mostrar el vuelto del pago */
					System.out.println();
					System.out.print("Venta realizada");
					System.out.println();
							
				}else System.out.print("La cantidad a vender excede a la disponible, disponible: " + obj[n].getStock());
			break;
			case 2:
				in.nextLine();
				System.out.println();
				while(n == -1) {
					System.out.print("Árticulo vendido: ");
					res = in.nextLine();
					System.out.println();
					for(int i = 0; i < obj.length; i++) { /* Compara String ingresado con todos los nombres de artículos 
					registrados */
						if(res.toUpperCase().equals(obj[i].getNombre().toUpperCase())) n = i;
					}
					if(n == -1) System.out.println("Nombre introducido erroneo");
				}
					
				System.out.print("Cantidad comprada: ");
				c = in.nextInt();
				System.out.println();
				obj[n].setStock(obj[n].getStock() + c); /* Aumentar el stock del artículo seleccionado */
				System.out.print("Compra realizada");
				System.out.println();
			break;
			default:
				System.out.print("Opcion introducida erronea, por favor vuelva a intentarlo");
			break;
			}
			System.out.println();	
		}while (z != '3');

	}
	
	public static void cambio_optimo(int DineroCliente, int cantidadpagar){              
		int b;
		DineroCliente = DineroCliente - cantidadpagar;
		
		 System.out.println("La vuelta sera de:");
		if(DineroCliente>=500){ 
		b = DineroCliente / 500; 
		DineroCliente = DineroCliente % 500;
		System.out.println(b + " billetes de 500€");
		}
		if(DineroCliente>=200){
		 b = DineroCliente / 200 ;
		 DineroCliente = DineroCliente % 200;
		 System.out.println(b + " billetes de 200€");
		}
		if(DineroCliente>=100){
		  b = DineroCliente / 100;
		  DineroCliente = DineroCliente % 100;
		  System.out.println(b + " billetes de 100€");
		}
		if(DineroCliente>=50){
		  b = DineroCliente / 50 ;
		  DineroCliente = DineroCliente % 50;
		  System.out.println(b + " billetes de 50€");
		}
		if(DineroCliente>=20){
		  b = DineroCliente / 20;
		  DineroCliente = DineroCliente % 20;
		  System.out.println(b + " billetes de 20€");
		}
		if(DineroCliente>=10){
		  b = DineroCliente / 10 ;
		  DineroCliente = DineroCliente % 10;
		  System.out.println(b + " billetes de 10€");
		}
		if(DineroCliente>=5){
		  b = DineroCliente / 5;
		  DineroCliente = DineroCliente % 5;
		  System.out.println(b + " billetes de 5€");
		}
		if(DineroCliente>=2){
		  b = DineroCliente / 2;
		  DineroCliente = DineroCliente % 2;
		  System.out.println(b + " monedas de 2€");
		}
		if(DineroCliente>=1){
		  System.out.println(DineroCliente + " monedas de 1€");
		}
	} 

}
