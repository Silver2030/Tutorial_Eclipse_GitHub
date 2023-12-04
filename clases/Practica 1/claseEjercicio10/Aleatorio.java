package claseEjercicio10;

import java.util.Scanner;

public class Aleatorio {
	private int num;
	private int aleatorio;

	public Aleatorio() {
		super();
	}
	
	
	public Aleatorio(int num, int aleatorio) {
		super();
		this.num = num;
		this.aleatorio = aleatorio;
	}

	public int introducir() {
		Scanner in = new Scanner(System.in);
		int val;
		
		System.out.print("Introduce un número: ");
		val = in.nextInt();
		return val;
	}
	
	void comparar() {
		if(num != aleatorio) {
			if (num>aleatorio) System.out.println("No has acertado: el número es menor. Prueba otra vez");
			else System.out.println("No has acertado: el número es mayor. Prueba otra vez");
		}else System.out.println("Has acertado: el número era " + num + " enhorabuena");
	}
	
	public int generaNumeroAleatorio(int minimo,int maximo){
		int num=(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
		return num;
		 }

	public Aleatorio(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


	public int getAleatorio() {
		return aleatorio;
	}


	public void setAleatorio(int aleatorio) {
		this.aleatorio = aleatorio;
	}
	
	

}
