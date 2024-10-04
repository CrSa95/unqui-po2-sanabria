package ar.edu.unq.po2.tp4;

public class ProductoCooperativa extends Producto {

	public ProductoCooperativa(String nombre, double precio, int stock) {
		super(nombre, precio, stock);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void setPrecio(double precio){
		this.precio = precio - (precio * 10)/100;
	}
}
