package claseEjercicio5;

public class TablaApp {

	public static void main(String[] args) {
		int num, resultado = 0;;
		Tabla obj = new Tabla();
		
		num = obj.pedir();
		obj.setNum(num);
		for(int i = 1; i <= 10; i++) {
			 resultado = obj.multiplicar(i);
			 System.out.println(num + " * " + i + " = " + resultado);
		 }
	}
}