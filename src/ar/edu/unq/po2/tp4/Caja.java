package ar.edu.unq.po2.tp4;

public class Caja {
	private double total; 

	public Caja() {
	}
	
	public double getTotal() {
		return total;
	}
	
	public void registrarProducto(Producto producto) {
		this.total += producto.getPrecio();
		producto.decrementarStock();
	}
	
	public void registrarFactura(Factura factura, Agencia agencia) {
		this.total += factura.getMonto();
		agencia.registrarPago(factura);
	}

}
