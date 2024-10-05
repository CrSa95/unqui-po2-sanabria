package ar.edu.unq.po2.tp4;

abstract class Factura {
	
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

	public double montoAPagar() {
		return tasaServicio;
	}

}
