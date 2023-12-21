package claseEjercicio16;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Terrenos {
	private String forma;
	private int medida;
	private double valorm2;
	private double descuento;
	
	public Terrenos() {
		super();
	}

	public Terrenos(String forma, int medida, double valorm2, double descuento) {
		super();
		this.forma = forma;
		this.medida = medida;
		this.valorm2 = valorm2;
		this.descuento = descuento;
	}

	public String pedirtexto() {
		Scanner in = new Scanner(System.in);
		String form;
		form = in.nextLine();
		return form;
	}
	
	public int pedirnumint() {
		Scanner in = new Scanner(System.in);
		int num;
		num = in.nextInt();
		return num;
	}
	
	public double pedirnumdouble() {
		Scanner in = new Scanner(System.in);
		double numd;
		numd = in.nextDouble();
		return numd;
	}
	
	public void descuento() { /* Calculo del descuento correspondiente */
		double[] desc = {0.95, 0.90, 0.85, 0.80, 0.75};
		int [] lim1 = {120,151,171,201,251};
		int [] lim2 = {150,170,200,250,10000};
		descuento = 1;
		 for(int i=0;i<desc.length;i++){
			 if((medida >= lim1[i])&&(medida<=lim2[i])) {
				 descuento = desc[i];
			 }
		 }
	}
	
	public double descuentotal() { /* Valor final del descuento */
		double resultado;
		resultado = medida * valorm2 * (1 - descuento);
		return resultado;
	}
	
	public double resultadototal() { /* Valor final del terreno */
		double resultado;
		resultado = medida * valorm2 - descuentotal();
		return resultado;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public int getMedida() {
		return medida;
	}

	public void setMedida(int medida) {
		this.medida = medida;
	}

	public double getValorm2() {
		return valorm2;
	}

	public void setValorm2(double valorm2) {
		this.valorm2 = valorm2;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00##");
		return 	"Terreno: " + forma + "\n" +
		"Medidas: " + medida + " m2" + "\n" +
		"Valor (m2): " + valorm2 + "\n" +
		"Descuento: " + df.format(descuentotal()) + "\n" +
		"Resultado: " + df.format(resultadototal());
	}

}
