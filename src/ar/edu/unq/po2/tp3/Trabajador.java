package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresosAnuales = new ArrayList<Ingreso>();
	private List<IngresoHorasExtras> ingresosAnualesHsExtras = new ArrayList<IngresoHorasExtras>();
	
	public Trabajador() {
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		this.ingresosAnuales.add(ingreso);
	}
	
	public void agregarIngresoHsExtras(IngresoHorasExtras hsExtras) {
		this.ingresosAnualesHsExtras.add(hsExtras);
	}
	
	public double getTotalPercibido() {
		//total 
		double sumaTotal = 0;	
		for(Ingreso i: ingresosAnuales){
			for(IngresoHorasExtras ihs: ingresosAnualesHsExtras){
			sumaTotal += ihs.getMonto() + i.getMonto();
			}
		}
		return sumaTotal;
	}
	public double getMontoImponible() {
		//la suma de todos los ingresos, excluyendo hs extras 
		double sumaTotal = 0;	
		for(Ingreso i: ingresosAnuales){
			for(IngresoHorasExtras ihs: ingresosAnualesHsExtras){
			sumaTotal += ihs.getMontoImponible() + i.getMontoImponible();
			}
		}
		return sumaTotal;
	}
	public double getImpuestoAPagar() {
		//monto 2% del total de los ingresos imponibles
		double sumaTotal = 0;	
		for(Ingreso i: ingresosAnuales){
			sumaTotal += (i.getMontoImponible()*2)/100;
			}
		return sumaTotal;
	}
}
