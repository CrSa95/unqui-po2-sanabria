package ar.edu.unq.po2.tp4;

public class AgenciaImpuestos implements Agencia {
	
	private double totalAbonado;
	
	public AgenciaImpuestos() {
	}
	
	public double getTotalAbonado() {
		return this.totalAbonado;
	}
	
	@Override
	public void registrarPago(Factura factura) {
		totalAbonado += factura.getMonto();		
	}
}
