package ar.edu.unq.po2.tp4;

public class ProductoEmpresaTradicional implements Producto {
	String nombre;  
	double precio; 
	int stock;
	
	public ProductoEmpresaTradicional(String nombre, double precio, int stock){
		this.nombre = nombre;
		this.precio = precio;
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
