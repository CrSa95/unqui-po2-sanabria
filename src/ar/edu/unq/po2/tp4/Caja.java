package ar.edu.unq.po2.tp4;

public class Caja {
	private double total; 

	public Caja() {
	}
	
	public double getTotal() {
		return total;
	}
	
	public void registrarProducto(Pagar objeto) {
		this.total += objeto.montoAPagar();
		objeto.registrarElPago(objeto);
	}
	/*
	public void registrarFactura(Factura factura) {
		this.total += factura.montoAPagar();
		registrarPago(factura);
	}
	*/
	
}
