package poo1;

public class AppArticulo {

	public static void main(String[] args) {
		double total;
		Articulo a1, a2, a3;
		a1 = new Articulo();
		a1.setReferencia(100);
		a1.setDesignacion("Mortadelo y Filemón");
		a1.setPrecio(7.5);
		a1.setCategoria("Humor");
		System.out.println("REFERENCIA: " + a1.getReferencia() + " Designación: " + a1.getDesignacion() 	+ 
				" Categoria: " + a1.getCategoria() + " Precio: " + a1.getPrecio());
		
		a2 = new Articulo(200,"Lazarillo de Tormes",10.25,"Medieval");
		System.out.println("REFERENCIA: " + a2.getReferencia() + " Designación: " + a2.getDesignacion() 	+ 
				" Categoria: " + a2.getCategoria() + " Precio: " + a2.getPrecio());
		
		a3 = new Articulo(175,"Libro 2, mejorado",12.33,"Fantasía");
		System.out.println("REFERENCIA: " + a3.getReferencia() + " Designación: " + a3.getDesignacion() 	+ 
				" Categoria: " + a3.getCategoria() + " Precio: " + a3.getPrecio());
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println("-------------------------------------------------------------------------------------");
		
		total = a1.getPrecio() + a2.getPrecio() + a3.getPrecio();
		
		System.out.println("El precio total sumando los 3 libros es de " + total);

	}

}
