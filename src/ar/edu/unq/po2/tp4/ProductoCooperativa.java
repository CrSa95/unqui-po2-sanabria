package ar.edu.unq.po2.tp4;

public class ProductoCooperativa implements Producto {
	String nombre;  
	double precio; 
	int stock;
	
	public ProductoCooperativa(String nombre, double precio, int stock){
		this.nombre = nombre;
		this.precio = precio - (precio * 10)/100;
		this.stock = stock;
	}
	
	@Override
	public double getPrecio() {
		return precio;
	}

	@Override
	public int getStock() {
		return stock;
	}

	@Override
	public void decrementarStock() {
		this.stock -= 1;
	}

	@Override
	public String getNombre() {
		return nombre;
	}
}
