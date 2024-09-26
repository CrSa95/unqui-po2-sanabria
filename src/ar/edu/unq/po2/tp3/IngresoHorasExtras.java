package ar.edu.unq.po2.tp3;

public class IngresoHorasExtras {
	private String mes;
	private String concepto;
	private double monto;
	private int hsExtras;
	
	public IngresoHorasExtras(String mes, String concepto, double monto, int hsExtras) {
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
		this.hsExtras = hsExtras;
	}
	
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getMontoImponible() {
		return 0;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public int getHsExtras() {
		return hsExtras;
	}
	public void setHsExtras(int hsExtras) {
		this.hsExtras = hsExtras; 
	}
}
