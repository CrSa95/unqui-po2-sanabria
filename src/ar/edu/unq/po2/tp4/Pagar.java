package ar.edu.unq.po2.tp4;

public interface Pagar {
	public double montoAPagar();
	public <T> void registrarElPago(T objeto);
}
