package ar.edu.unq.po2.tpJavaPoo;

public class Ingreso {
	
	private String mes;
	private String concepto;
	private double monto;
	private int hsExtras;
	private double montoHsExtras;
	
	public Ingreso(String mes, String concepto, double monto) {
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}
	
	public Ingreso(String mes, String concepto, double monto, int hsExtras) {
		this.mes = mes;
		this.concepto = concepto;
		this.montoHsExtras = monto;
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
		return monto;
	}
	public double getMonto() {
		return monto;
	}
	public double getmontoHsExtras() {
		return montoHsExtras;
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
