package claseCoche;

public class CocheApp {

	public static void main(String[] args) {
		Coche obj = new Coche(); 
		
		System.out.print("Introduce el número de ruedas del coche: ");
		obj.setRuedas(obj.pedirInt());
		while(obj.getRuedas()<1) {
			System.out.print("Valor introducido erroneo, introduce un superior a 1: ");
			obj.setRuedas(obj.pedirInt()); /* Validar que no se pueda meter números negativos */
		}
		
		System.out.print("Introduce el color del coche: ");
		obj.setColor(obj.pedirString());
		
		System.out.print("Introduce el peso del coche: ");
		obj.setPeso(obj.pedirInt());
		while(obj.getPeso()<0) {
			System.out.print("Valor introducido erroneo, introduce un número entero: ");
			obj.setPeso(obj.pedirInt());
		}
		
		System.out.print("Introduce el ancho (cm) del coche: ");
		obj.setAncho(obj.pedirInt());
		while(obj.getAncho()<0) {
			System.out.print("Valor introducido erroneo, introduce un número entero: ");
			obj.setAncho(obj.pedirInt());
			}
		
		System.out.print("Introduce el largo (cm) del coche: ");
		obj.setLargo(obj.pedirInt());
		while(obj.getLargo()<0) {
			System.out.print("Valor introducido erroneo, introduce un número entero: ");
			obj.setLargo(obj.pedirInt());
		}
		
		System.out.print("Introduce el motor del coche: ");
		obj.setMotor(obj.pedirString());
		
		System.out.println();
		
		System.out.println(obj.toString());
		
	}

}
