package ar.edu.unq.po2.tp6Solid;

public class CreditoHipotecario extends Credito{

	public CreditoHipotecario(int plazoMeses, double montoSolicitado, Propiedad propiedad) {
		super(plazoMeses, montoSolicitado, propiedad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean evaluarCredito(Cliente cliente) {
		return cuotaMensual < (cliente.sueldoNetoMensual()/2) && 
			   montoSolicitado < ((propiedadHipotecada.getValorFiscal() *70) / 100) &&
			   cliente.getEdad()+(plazoMeses/12) < 65;
	}

}
