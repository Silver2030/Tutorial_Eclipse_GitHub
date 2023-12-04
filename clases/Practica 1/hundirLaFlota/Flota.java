package hundirLaFlota;

import java.util.Arrays;

public class Flota {
    char caracterSinDestapar;
    char caracterDestapado;
	private String[] letras = {"A","B","C","D","E","F","G","H"};
	private String[][] tablero;
	
	public Flota() {
		super();
	}

	public Flota(int dimension, char caracterSinDestapar, char caracterDestapado, String[] letras, String[][] tablero) {
		super();
		this.caracterSinDestapar = caracterSinDestapar;
		this.caracterDestapado = caracterDestapado;
		this.letras = letras;
		this.tablero = tablero;
	}

	void imprimeTablero() {
		tablero = new String[9][9];
		for(int i = 1; i <= 8; i++) {
			for(int j = 1; j <= 8; j++) {
			tablero[i][j] = letras[i-1] + String.valueOf(j);
			}
		}
		
		for(int i=1; i <= 8; i++)
        {
            for(int j=1; j <= 8; j++)
            {
                System.out.print(tablero[j][i] + "\t");
            }
            System.out.println("\n");
        }
    }
	
	public char getCaracterSinDestapar() {
		return caracterSinDestapar;
	}

	public void setCaracterSinDestapar(char caracterSinDestapar) {
		this.caracterSinDestapar = caracterSinDestapar;
	}

	public char getCaracterDestapado() {
		return caracterDestapado;
	}

	public void setCaracterDestapado(char caracterDestapado) {
		this.caracterDestapado = caracterDestapado;
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String[][] getTablero() {
		return tablero;
	}

	public void setTablero(String[][] tablero) {
		this.tablero = tablero;
	}


}
