package hundirLaFlota;

import java.util.ArrayList;

public class Flota {
    public ArrayList<Integer> x = new ArrayList<Integer>();
    public ArrayList<Integer> y = new ArrayList<Integer>();
    private String posicion;
	private String[][] tablero = new String[11][11];
	private String[] reglas = new String[11];
	private ArrayList<String> ocupadas = new ArrayList<String>();
	private ArrayList<String> repetidas = new ArrayList<String>();
	private ArrayList<String> posfinal = new ArrayList<String>();
	private int tamano;
	private String nombre;
	    
	
	public Flota() {
		super();
	}
	
	public Flota(ArrayList<Integer> x, ArrayList<Integer> y, String posicion, String[][] tablero, String[] reglas,
			ArrayList<String> ocupadas, ArrayList<String> repetidas, ArrayList<String> posfinal, int tamano,
			String nombre) {
		super();
		this.x = x;
		this.y = y;
		this.posicion = posicion;
		this.tablero = tablero;
		this.reglas = reglas;
		this.ocupadas = ocupadas;
		this.repetidas = repetidas;
		this.posfinal = posfinal;
		this.tamano = tamano;
		this.nombre = nombre;
	}
	
	public void barco(int tamano, String nombre, String posicion){
        this.tamano = tamano;
        this.nombre = nombre;
        this.posicion=posicion;
		}

	public void creartablero() {
			int letras=65;
	        int num=49;
	        char numeros=(char)49;
	        char letra=(char)65;
	        for(int i=1;i<11;i++){
	            tablero[0][i]=Character.toString(numeros);
	            num=num+1;
	            numeros=(char)num;
	        }
	        for(int i=1;i<11;i++){
	            tablero[i][0]=Character.toString(letra);
	            letras=letras+1;
	            letra=(char)letras;
	        }
	  
	        for(int i = 1; i < 11; i++) {
				for(int j = 1; j <= 10; j++) {
				tablero[i][j] = "*";
				}
			}
	        
	        tablero[0][10]="10";
	        tablero[0][0]="";
	}
	
	public  void mostartablero(){
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                System.out.print(tablero[i][j]+"\t");
            }
            System.out.println("\t"+"\n");
        }
    }
	
	public void crearreglas(){
        reglas[0]="			Reglas del juego Hundir la Flota";
        reglas[1]="El juego se terminara una vez descubras la posicion de todos los barcos enemigos o se acaben los 25 intentos";
        reglas[2]="Cuando se te pida que digas una posición, tienes que decir una letra y un numero";
        reglas[3]="Simbología: ";
        reglas[4]="	* - Cuadro oculto: Se desconoce que se encuentra debajo de él";
        reglas[5]="	- - Agua: El cuadro ha sido atacado pero no se ha logrado tocar nada";
        reglas[6]="	+ - Tocado: El cuadro ha sido atacado y se ha logrado dar con una parte de barco";
        reglas[7]="	X - Hundido: El cuadro ha sido atacado y se ha logrado acabar con todo el barco";
        reglas[8]="Composición de la Flota:";
        reglas[9]="	1 Portaaviones(Ocupa 4 espacios), 2 Acorazados(3 posiciones cada uno)";
        reglas[10]="	3 Buques(2 posiciones cada uno) y 4 Submarinos(1 posicion cada uno)";
    }
	
	public void mostrarreglas() {
		for(int i=0; i<11;i++) {
			System.out.println("\t"+reglas[i]+"\n");
		}
		System.out.println();
	}
	
	public int letranum(String user) {
		if("A".equals(user.substring(0,1))){
            return 1;
        }else if("B".equals(user.substring(0,1))){
            return 2;
        }else if("C".equals(user.substring(0,1))){
            return 3;
        }else if("D".equals(user.substring(0,1))){
            return 4;
        }else if("E".equals(user.substring(0,1))){
            return 5;
        }else if("F".equals(user.substring(0,1))){
            return 6;
        }else if("G".equals(user.substring(0,1))){
            return 7;
        }else if("H".equals(user.substring(0,1))){
            return 8;
        }else if("I".equals(user.substring(0,1))){
            return 9;
        }else if("J".equals(user.substring(0,1))){
            return 10;
        }else return 0;	
	}
	
    public void genenarbarcos(int logitud){
        int x=(int) (Math.random()*10+1);
        int y=(int) (Math.random()*10+1);
        int orientacion=(int) (Math.random()*2+1);
        String orientado="";
        if(x<5 && y<5){
            if(orientacion==1){
                orientado="derecha";
            }else{
                orientado="abajo";
            }
        }else if(x>5 && y>5){
            if(orientacion==1){
                orientado="izquierda";
            }else{
                orientado="arriba";
            }
        }else if(x>5 && y<5){
            orientado="arriba";
        }else if(x<5 && y>5){
            orientado="abajo";
        }else{
            if(orientacion==1){
                orientado="izquierda";
            }else{
                orientado="arriba";
            }
        }
        generarposiciones(x,y,orientado,logitud);
    }
    
    public void valortablero(int x, int y, char z){
    	tablero[x][y] = "z";
    }
    
    public void generarposiciones(int x, int y, String orientado, int longitud){
        String posicionesfinal="";
        int conterr=0;
        if(orientado=="derecha"){
            for(int o=y;o<y+longitud;o++){
                if(comprobar(x,o)==true){
                    conterr=1;
                    repetidas.add(Integer.toString(x)+","+Integer.toString(o));
                }else{
                    ocupadas.add(Integer.toString(x)+","+Integer.toString(o));
                    posicionesfinal=posicionesfinal+Integer.toString(x)+","+Integer.toString(o)+" ";
                }
            }
        }
        if(orientado=="izquierda"){
            for(int o=y;o>y-longitud;o--){
                if(comprobar(x,o)==true){
                    conterr=1;
                    repetidas.add(Integer.toString(x)+","+Integer.toString(o));
                }else{
                    ocupadas.add(Integer.toString(x)+","+Integer.toString(o));
                    posicionesfinal=posicionesfinal+Integer.toString(x)+","+Integer.toString(o)+" ";  
                }
            }
        }
        if(orientado=="abajo"){
            for(int o=x;o<x+longitud;o++){
                if(comprobar(o,x)==true){
                    conterr=1;
                    repetidas.add(Integer.toString(x)+","+Integer.toString(o));
                }else{
                    ocupadas.add(" "+Integer.toString(o)+","+Integer.toString(x));
                    posicionesfinal=posicionesfinal+Integer.toString(o)+","+Integer.toString(x)+" ";
                }
            }
        }
        if(orientado=="arriba"){
            for(int o=x;o>x-longitud;o--){
                if(comprobar(o,x)==true){
                    conterr=1;
                    repetidas.add(Integer.toString(x)+","+Integer.toString(o));
                }else{
                    ocupadas.add(Integer.toString(o)+","+Integer.toString(x));
                    posicionesfinal=posicionesfinal+Integer.toString(o)+","+Integer.toString(x)+" "; 
                }
            }
        }
        if (conterr==1){
            genenarbarcos(longitud);
        }else{
            posfinal.add(posicionesfinal);
        }
    }
    
    public boolean comprobar(int x,int o){
        String pos = Integer.toString(x)+","+Integer.toString(o);
        String pos2 = Integer.toString(x)+","+Integer.toString(o)+",";
        String pos3 = " "+Integer.toString(x)+","+Integer.toString(o)+",";
        String pos4 = " "+Integer.toString(x)+","+Integer.toString(o);
        if(ocupadas.contains(pos)==true || ocupadas.contains(pos2)==true || ocupadas.contains(pos3)==true ||ocupadas.contains(pos4)==true){
            return true;
        }else{
            return false;
        }
    }
    
    public int posiciones(){
        return this.x.size();
    }

	public ArrayList<Integer> getX() {
		return x;
	}

	public void setX(ArrayList<Integer> x) {
		this.x = x;
	}

	public ArrayList<Integer> getY() {
		return y;
	}

	public void setY(ArrayList<Integer> y) {
		this.y = y;
	}

	public String[][] getTablero() {
		return tablero;
	}

	public void setTablero(String[][] tablero) {
		this.tablero = tablero;
	}

	public String[] getReglas() {
		return reglas;
	}

	public void setReglas(String[] reglas) {
		this.reglas = reglas;
	}

	public String getPosicion() {
		return posicion;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public void tocado(int fila,int columna){
        this.x.add(fila); 
        this.y.add(columna);
    }
	

}
