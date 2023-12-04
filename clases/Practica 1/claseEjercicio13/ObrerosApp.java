package claseEjercicio13;

public class ObrerosApp {

	public static void main(String[] args) {
		Obreros obj[]=new Obreros[3];
		
		for (int i=0;i<obj.length;i++){
            obj[i]=new Obreros();
        }
		
		for (int i=0;i<obj.length;i++){
		System.out.print("Introduce las horas trabajadas: ");
		obj[i].setHoras(obj[i].pedir());
		
		System.out.println("El salario neto del obrero número " + i + " sera de " + obj[i].sueldo());
		System.out.println();
		}
	}

}
