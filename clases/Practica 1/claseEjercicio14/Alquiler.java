package claseEjercicio14;

import java.util.Scanner;

public class Alquiler {
	private Integer km;

	public Alquiler() {
		super();
	}

	public Alquiler(int km) {
		super();
		this.km = km;
	}
	
	public int pedir() {
		Scanner in = new Scanner(System.in);
		int pedir;
		
		pedir = in.nextInt();
		return pedir;
	}
	
	public Double pago() {
		Double pago;
		if(km <= 300) {
			pago = 130.00;
		}else if((km > 300)&&(km <= 1000)) {
			pago = 130.00 + (km - 300.00) * 5.00;
		}else {
			pago = 3630.00 + (km - 1000.00) * 10.00;
		}
		
		pago = pago * 1.16;
		return pago;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return "Alquiler [km=" + km + "]";
	}
	
	

}
