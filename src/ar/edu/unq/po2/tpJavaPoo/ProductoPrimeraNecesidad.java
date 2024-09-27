package ar.edu.unq.po2.tpJavaPoo;

public class ProductoPrimeraNecesidad {
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado;

	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento, boolean esPrecioCuidado) {
		//El descuento se expresa en porcentaje del 1 al 100
		this.nombre = nombre;
		this.precio = precio - (precio * descuento)/100;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio, double descuento) {
		//El descuento se expresa en porcentaje del 1 al 100
		this.precio = precio - (precio * descuento)/100;
	}
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void setPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}
}

