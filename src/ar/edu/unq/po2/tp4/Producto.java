package ar.edu.unq.po2.tp4;

abstract class Producto {
	
	String nombre;  
	double precio; 
	int stock;
	
	Producto(String nombre, double precio, int stock) {
		this.nombre = nombre;
		setPrecio(precio);
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}
	
	public void decrementarStock() {
		this.stock -= 1;
	}

	String getNombre() {
		return nombre;
	}
	
	public void setPrecio(double precio){
		this.precio = precio;
	}
}
