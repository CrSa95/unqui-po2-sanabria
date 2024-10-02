package ar.edu.unq.po2.tp4;

public class FacturaServicios extends Factura {
	
	FacturaServicios(double costo, int unidadConsumida) {
		super(costo, unidadConsumida);
		// TODO Auto-generated constructor stub
	}

	@Override 
	public double montoAPagar() {
		return costo*unidadConsumida;
	}

}
