package ar.edu.unq.po2.tpJavaPoo;

public class Producto {
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public Producto(String nombre, double precio, double descuento, boolean esPrecioCuidado) {
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
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void aumentarPrecio(double precioNuevo) {
		this.precio += precioNuevo;
	}
}

