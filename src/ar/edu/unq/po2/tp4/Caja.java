package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Caja implements Agencia {
	
	private double total; 
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Caja() {
	}
	
	public void setProducto(Producto producto) {
		productos.add(producto);
	}
	
	public double getTotal() {
		return total;
	}
	
	public void registrarOperacion() {
		for(Producto p: productos){
			total += p.getPrecio();
			p.decrementarStock();
			}
	}
	
	public void registrarOperacion(Factura factura) {
		this.total += factura.montoAPagar();
		registrarPago(factura);
	}

	@Override
	public void registrarPago(Factura factura) {
		// TODO Auto-generated method stub
		
	}
	
	
}
