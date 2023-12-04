package claseEjercicio11;

import java.util.Scanner;

public class Libro {
	
	private String titulo;
	private String autor;
	private int libros;
	private int prestamos;
	
	public Libro() {
		super();
		
	}

	public Libro(String titulo, String autor, int libros, int prestamos) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.libros = libros;
		this.prestamos = prestamos;
	}
	
	public int pedirint() {
		Scanner in = new Scanner(System.in);
		int p;
		
		p = in.nextInt();
		return p;
	}
	
	public String pedirString() {
		Scanner in = new Scanner(System.in);
		String p;
		
		p = in.nextLine();
		return p;
	}
	
	public boolean prestar(int disponibles, int prestados) {
		if(disponibles<prestados) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean devolver(int disponibles, int prestados) {
		if(prestados == 0) {
			return false;
		}else {
			return true;
		}
	}
	
	void libro1() {
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getLibros() {
		return libros;
	}

	public void setLibros(int libros) {
		this.libros = libros;
	}

	public int getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(int prestamos) {
		this.prestamos = prestamos;
	}

	@Override
	public String toString() {
		return titulo + " escrito por " + autor + " tiene un total de " + libros + " copias disponibles y " + prestamos + " copias prestadas";
	}
	
}