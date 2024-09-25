package ar.edu.unq.po2.tp3;

public class ProductoPrimeraNecesidad {
	private String nombre;
	private double precio;
	private boolean esPrimeraNecesidad;

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrimeraNecesidad) {
		this.nombre = nombre;
		this.precio = precio * 0.9;
		this.esPrimeraNecesidad = esPrimeraNecesidad;
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
		this.precio = precio * 0.9;
	}
	public boolean isEsPrimeraNecesidad() {
		return esPrimeraNecesidad;
	}

	public void setEsPrimeraNecesidad(boolean esPrimeraNecesidad) {
		this.esPrimeraNecesidad = esPrimeraNecesidad;
	}
}

