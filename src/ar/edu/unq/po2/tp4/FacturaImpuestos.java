package ar.edu.unq.po2.tp4;

public class FacturaImpuestos implements Factura  {
	
	private double tasaServicio;
	
	public FacturaImpuestos(double tasaServicio) {
		this.tasaServicio = tasaServicio;
	}

	@Override
	public double getMonto() {
		return tasaServicio;
	}

}
