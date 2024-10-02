package ar.edu.unq.po2.tp4;

abstract class Producto implements Pagar {
	
	String nombre;  
	double precio; 
	int stock;
	
	Producto(String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	@Override 
	public double montoAPagar() {
		return precio;
	}

	int getStock() {
		return stock;
	}
	
	@Override
	public <T> void registrarElPago(T objeto) {
		decrementarStock();
	}
	
	void decrementarStock() {
		this.stock -= 1;
	}

	String getNombre() {
		return nombre;
	}
}
