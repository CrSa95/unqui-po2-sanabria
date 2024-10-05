package ar.edu.unq.po2.tp6Solid;

public abstract class Credito{

	protected int plazoMeses;
	protected double montoSolicitado;
	protected double cuotaMensual;
	protected Propiedad propiedadHipotecada;
	
	public Credito (int plazoMeses,double montoSolicitado) {
		this.plazoMeses = plazoMeses;
		this.montoSolicitado = montoSolicitado;
	}
	
	public Credito (int plazoMeses,double montoSolicitado, Propiedad propiedad) {
		this.plazoMeses = plazoMeses;
		this.montoSolicitado = montoSolicitado;
		this.propiedadHipotecada = propiedad;
	}
	
	public void calcularCuota(){
		this.cuotaMensual =  montoSolicitado/plazoMeses;
	}
	
	public double getCuotaMensual() {
		return cuotaMensual;
	}
	
	public double getMontoSolicitado() {
		return montoSolicitado;
	}
	
	public abstract boolean evaluarCredito(Cliente cliente);
}
