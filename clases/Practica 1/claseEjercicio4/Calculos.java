package claseEjercicio4;

public class Calculos {
	private int suma1;
	private int suma2;
	private char app1;
	
		public Calculos() {
		super();
	}

	public Calculos(int suma1, int suma2, char app1) {
			super();
			this.suma1 = suma1;
			this.suma2 = suma2;
			this.app1 = app1;
	}
	
	int resultado;
	void Sumar(int suma1, int suma2) {
		resultado = suma1 + suma2;
	}
	
	void Elegir() {
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Dividir");
		System.out.println("4. Multiplicar");
	}
	
	void error() {
		System.out.println("Opcion seleccionada invalida, por favor eliga una valida");
	}
	
	void pedir() {
		System.out.print("Introduce el número: ");
	}
	
	void MostrarSumar() {
		System.out.print("La suma de los números es " + resultado);
	}
	
	void Restar(int suma1, int suma2) {
		resultado = suma1 - suma2;
	}
	
	void MostrarRestar() {
		System.out.print("La resta de los números es " + resultado);
	}
	
	void Dividir(int suma1, int suma2) {
		resultado = suma1 / suma2;
	}
	
	void MostrarDividir() {
		System.out.print("La division de los números es " + resultado);
	}
	
	void Multiplicacion(int suma1, int suma2) {
		resultado = suma1 * suma2;
	}
	
	void MostrarMultiplicacion() {
		System.out.print("La multiplicacion de los números es " + resultado);
	}

	public int getSuma1() {
		return suma1;
	}

	public void setSuma1(int suma1) {
		this.suma1 = suma1;
	}

	public int getSuma2() {
		return suma2;
	}

	public void setSuma2(int suma2) {
		this.suma2 = suma2;
	}
	
	public int getApp1() {
		return app1;
	}

	public void setApp1(char app1) {
		this.app1 = app1;
	}
	
	public int Sumas(int suma1, int suma2) {
		int resultado;
		resultado = suma1 + suma2;
		return resultado;
	}
	
}