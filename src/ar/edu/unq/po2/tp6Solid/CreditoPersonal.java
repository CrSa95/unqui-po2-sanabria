package ar.edu.unq.po2.tp6Solid;

public class CreditoPersonal extends Credito{

	public CreditoPersonal(int plazoMeses, double montoSolicitado) {
		super(plazoMeses, montoSolicitado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean evaluarCredito(Cliente cliente) {
		return cliente.sueldoNetoAnual() >= 15000 && 
			   cuotaMensual < ((cliente.sueldoNetoMensual()*70) / 100);
	}
}
