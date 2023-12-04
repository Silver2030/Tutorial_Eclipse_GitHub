package claseEjercicio5;

import java.util.Scanner;

public class Tabla {
	private int num;

	public Tabla() {
		super();
	}

	public Tabla(int num) {
		super();
		this.num = num;
	}
	
	public int pedir() {
		int num;
		Scanner in = new Scanner(System.in);
		
		 System.out.print("Introduce el número que quieras ver la tabla: ");
		 num = in.nextInt();
		 in.close();
		 return num;	 
	}
	
	public int multiplicar(int i) {
		int resultado;
		resultado = num * i;
		return resultado;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}