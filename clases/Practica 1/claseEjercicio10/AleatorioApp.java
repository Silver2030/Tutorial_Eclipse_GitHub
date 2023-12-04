package claseEjercicio10;

public class AleatorioApp {
	
	public static void main(String[] args) {
		Aleatorio obj = new Aleatorio();
		
		obj.setAleatorio(obj.generaNumeroAleatorio(100, 1));
		System.out.println(obj.getAleatorio());
		
		while(obj.getNum() != obj.getAleatorio()) {
		obj.setNum(obj.introducir());
		
		obj.comparar();
		
		}
		
		
	}

}
