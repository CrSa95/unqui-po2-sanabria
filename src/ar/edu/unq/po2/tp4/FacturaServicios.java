package ar.edu.unq.po2.tp4;

public class FacturaServicios implements Factura {
	
	private double costo;
	private int unidadConsumida; 
	
	public FacturaServicios(double costo, int unidadConsumida) {
		this.costo = costo;
		this.unidadConsumida = unidadConsumida;
	}
	
	@Override
	public double getMonto() {
		
		return this.costo * this.unidadConsumida;
	}

}
