package claseEjercicio3;

public class Suma {
	private int suma1;
	private int suma2;
	
		public Suma() {
		super();
	}

	public Suma(int suma1, int suma2) {
			super();
			this.suma1 = suma1;
			this.suma2 = suma2;
	}
	
	int resultado;
	void Resultado(int suma1, int suma2) {
		resultado = suma1 + suma2;
	}
	
	void mostrar() {
		System.out.print("La suma de los números es " + resultado);
	}
	
	void pedir() {
		System.out.print("Introduce el número: ");
		
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
	
}