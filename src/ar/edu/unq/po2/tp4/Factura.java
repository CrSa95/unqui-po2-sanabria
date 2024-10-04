package ar.edu.unq.po2.tp4;

abstract class Factura implements Pagar, Agencia {
	
	double tasaServicio;
	double costo;
	int unidadConsumida;

	Factura(double tasaServicio) {
		this.tasaServicio = tasaServicio;
	}
	
	Factura(double costo, int unidadConsumida) {
		this.costo = costo;
		this.unidadConsumida = unidadConsumida;
	}
	
	@Override 
	public double montoAPagar() {
		return tasaServicio;
	}
	
	@Override
	public <T> void registrarElPago(T objeto) {
		registrarPago((Factura) objeto);
	}
	
	@Override
	public void registrarPago(Factura factura) {
		System.out.println("Pago registrado");
	}

}
