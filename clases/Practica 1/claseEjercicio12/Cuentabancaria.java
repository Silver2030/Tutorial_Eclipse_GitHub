package claseEjercicio12;

import java.util.Scanner;

public class Cuentabancaria {
	private String nombre;
	private String codigo;
	private int saldo;
	
	public Cuentabancaria() {
		super();
	}

	public Cuentabancaria(String nombre, String codigo, int saldo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.saldo = saldo;
	}
	
	public String pedirstring() {
		Scanner in = new Scanner(System.in);
		String z;
		
		z = in.nextLine();
		return z;
	}
	
	public int pedirint() {
		Scanner in = new Scanner(System.in);
		int p;
		
		p = in.nextInt();
		return p;
	}
	
	public boolean retirar(int cantidad, int retirar) {
		if(retirar>cantidad) {
			return false;
		}else {
			return true;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Bienvenido " + nombre + " su código de cuenta es " + codigo + " y tiene un saldo total de " + saldo;
	}


}
