package claseEjercicio15;

import java.util.Scanner;

public class Ventas {
	private String nombre;
	private double precio;
	private char oferta;
	private int stock;
	
	public Ventas() {
		super();
	}

	public Ventas(String nombre, double precio, char oferta, int stock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.oferta = oferta;
		this.stock = stock;
	}
	
	public int pedirint() {
		Scanner in = new Scanner(System.in);
		int num;
		num = in.nextInt();
		return num;
	}
	
	public double pedirdouble() {
		Scanner in = new Scanner(System.in);
		double num;
		num = in.nextDouble();
		return num;
	}
	
	public char pedirchar() {
		Scanner in = new Scanner(System.in);
		char num;
		num = in.next().charAt(0);
		return num;
	}
	
	public  void cambio_optimo(int DineroCliente){              
		int B500=0, B200=0, B100=0, B50=0, B20=0, B10=0, B5=0, M2=0, M1=0;
		
		if(DineroCliente >= 500) {      
			B500=(int) DineroCliente / 500;      
			DineroCliente= DineroCliente % 500;         
			}         
		if(DineroCliente >= 200) {      
			B200=(int) DineroCliente / 200;      
			DineroCliente= DineroCliente % 200;         
			}         
		if(DineroCliente >= 100) {      
			B100=(int) DineroCliente / 100;      
			DineroCliente= DineroCliente % 100;         
			}         
		if(DineroCliente >= 50) {      
			B50=(int) DineroCliente / 50;      
			DineroCliente= DineroCliente % 50;         
			}                
		if(DineroCliente >= 20) {       
			B20=(int) DineroCliente / 20;       
			DineroCliente= DineroCliente % 20;          
			}                
		if(DineroCliente >= 10) {       
			B10=(int) DineroCliente / 10;       
			DineroCliente= DineroCliente % 10;          
			}                
		if(DineroCliente >= 5) {       
			B5=(int) DineroCliente / 5;       
			DineroCliente= DineroCliente % 5;          
			}                
		if(DineroCliente >= 2) {       
			M2=(int) DineroCliente / 2;       
			DineroCliente= DineroCliente % 2;          
			}                
		if(DineroCliente >= 1) {       
			M1=(int) DineroCliente / 1;    
			DineroCliente= DineroCliente % 1;          
			}  
		
		System.out.println("Billetes de 500€= "+B500);           
		System.out.println("Billetes de 200€= "+B200);           
		System.out.println("Billetes de 100€= "+B100);           
		System.out.println("Billetes de 50€= "+B50);           
		System.out.println("Billetes de 20€= "+B20);           
		System.out.println("Billetes de 10€= "+B10);           
		System.out.println("Billetes de 5€= "+B5);           
		System.out.println("Monedas de 2€= "+M2);           
		System.out.println("Monedas de 1€= "+M1);                  
		      
	} 

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public char getOferta() {
		return oferta;
	}

	public void setOferta(char oferta) {
		this.oferta = oferta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
