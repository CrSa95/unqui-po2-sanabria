package ar.edu.unq.po2.tp4;

public interface Producto {
	public String getNombre();
	public double getPrecio();
	public int getStock();
	public void decrementarStock();
}
