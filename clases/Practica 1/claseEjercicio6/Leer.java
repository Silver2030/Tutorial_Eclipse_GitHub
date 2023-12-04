package claseEjercicio6;

import java.util.Scanner;

public class Leer {
	private int num;

	public Leer() {
		super();
	}

	public Leer(int num) {
		super();
		this.num = num;
	}
	
	public int pedir() {
		Scanner in = new Scanner(System.in);
		int num;
		
		System.out.print("Introduce el número: ");
		num = in.nextInt();

		return num;
	}
	
	public boolean esPar() {	
		
		if(num % 2 == 0) return true;
		else return false;
	}
	
	public boolean multi5() {	
		
		if(num % 5 == 0) return true;
		else return false;
	}
	
	public boolean perfecto() {
	int tot = 0;
		for (int i = 1; i <= num/2 ; i++) {
        	if(num % i == 0) {
        	tot += i;
        	}
        }
		if(tot == num)	return true;
	    else return false;
	        
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	

}