package poo1;

public class Articulo {
	private int referencia;
	private String designacion;
	private double precio;
	private String categoria;
	
	
	public Articulo() {
		super();
		
	}


	public Articulo(int referencia, String designacion, double precio, String categoria) {
		super();
		this.referencia = referencia;
		this.designacion = designacion;
		this.precio = precio;
		this.categoria = categoria;
	}

	public int getReferencia() {
		return referencia;
	}


	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}


	public String getDesignacion() {
		return designacion;
	}


	public void setDesignacion(String designacion) {
		this.designacion = designacion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return "Articulo [referencia=" + referencia + ", designacion=" + designacion + ", precio=" + precio
				+ ", categoria=" + categoria + "]";
	}
	
	

}
