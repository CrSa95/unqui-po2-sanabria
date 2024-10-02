package ar.edu.unq.po2.tpJavaPoo;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresosAnuales = new ArrayList<Ingreso>();
	//private List<IngresoHorasExtras> ingresosAnualesHsExtras = new ArrayList<IngresoHorasExtras>();
	
	public Trabajador() {
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		this.ingresosAnuales.add(ingreso);
	}
	
	//public void agregarIngresoHsExtras(IngresoHorasExtras hsExtras) {
	//	this.ingresosAnualesHsExtras.add(hsExtras);
	//}
	
	public double getTotalPercibido() {
		//total 
		double sumaTotal = 0;	
		for(Ingreso i: ingresosAnuales){
			sumaTotal += i.getMonto()+i.getmontoHsExtras();
		}
		return sumaTotal;
	}
	public double getMontoImponible() {
		//la suma de todos los ingresos, excluyendo hs extras 
		double sumaTotal = 0;	
		for(Ingreso i: ingresosAnuales){
			sumaTotal += i.getMontoImponible();
		}
		return sumaTotal;
	}
	public double getImpuestoAPagar() {
		//monto 2% del total de los ingresos imponibles
		return (getMontoImponible()*2)/100;
	}
}
