package claseEjercicio13;

import java.util.Scanner;

public class Obreros {
	private int horas;

	public Obreros() {
		super();
	}

	public Obreros(int horas) {
		super();
		this.horas = horas;
	}
	
	public int pedir() {
		Scanner in = new Scanner(System.in);
		int pedir;
		
		pedir = in.nextInt();
		return pedir;
	}
	
	public double sueldo() {
		double sueldo;
		if(horas<=35) {
			sueldo = horas * 50;
		}else {
			sueldo = 1750 + (horas-35) * 75;
		}
		
		if(sueldo > 20000) {
			sueldo = sueldo * 0.8;
		}
		return sueldo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Obreros [horas=" + horas + "]";
	}
	
	

}
