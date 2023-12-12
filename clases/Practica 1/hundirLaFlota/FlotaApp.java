package hundirLaFlota;

import java.util.Scanner;
import java.util.ArrayList;

public class FlotaApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Flota obj = new Flota();
		char res;
		int num, intentos = 0;
		String[] letras = {"A","B","C","D","E","F","G","H"};
		String[][] valor = new String[9][9];
		ArrayList<String> barcos = new ArrayList<String>();
		
		
		obj.crearreglas();
		obj.mostrarreglas();
		obj.creartablero();
		obj.mostartablero();
		do {
		System.out.println("Introduce una casilla, primero letra despues numero");
		res = in.next().charAt(0);
		obj.x.add(obj.letranum(Character.toString(res)));
		num = in.nextInt();
		obj.y.add(num);
		String posxy= obj.getX()+","+ obj.getY();
        System.out.println(posxy);
		if((obj.x.get(intentos) == 0)||((obj.y.get(intentos)>10))) {
			System.out.print("Respuesta invalida, por favor vuelta a intentarlo: ");
		}else{
            boolean comprobacion = false;
            for(int i=0;i<barcos.size();i++){
                String barcopos = barcos.get(i);
                if(barcopos.contains(posxy)==true){
                	obj.valortablero(obj.x.get(intentos), obj.y.get(intentos), '+');
                    System.out.println("Bien has dado a un barco");
                    comprobacion=true;
                    obj.tocado(obj.x.get(intentos), obj.y.get(intentos));
                    if(barcos.get(i)==barcos.get(i)){
                        System.out.println("Hundido");
                        System.out.println("Has hundido un "+barcos.get(i).getNombre());
                        for(int o=0;o<barcos.get(i).posicionesx.size();o++){
                            tablero[barcos.get(i).posicionesx.get(o)][barcos.get(i).posicionesy.get(o)]="X";
                        }
                        barcos.remove(i);
                    }
                }
            }
            if(comprobacion==false){
                System.out.println("Agua");
                obj.valortablero(obj.x.get(intentos), obj.y.get(intentos), '-');
            }
        }
        obj.mostartablero();
        intentos ++;
        if(barcos.size()==0){
            break;
        }
       
		}while(intentos!=25);
		
	}
	
}
