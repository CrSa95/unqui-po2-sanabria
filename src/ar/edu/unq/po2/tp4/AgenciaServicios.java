package ar.edu.unq.po2.tp4;

public class AgenciaServicios implements Agencia {
	
	private double totalAbonado;
	
	public AgenciaServicios() {
	}
	
	public double getTotalAbonado() {
		return this.totalAbonado;
	}
	
	@Override
	public void registrarPago(Factura factura) {
		totalAbonado += factura.getMonto();	
	}
}
