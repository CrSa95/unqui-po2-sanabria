package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrabajadorTestCase {
	
	private Ingreso porHijos;
	private IngresoHorasExtras hsExtras;
	private Trabajador trabajador;
	
	@BeforeEach
	public void setUp() {
		porHijos = new Ingreso("Febrero","Por hijos",2000);
		hsExtras = new IngresoHorasExtras("Febrero","Por hijos",2000,20);
		trabajador = new Trabajador();	
	}
	
	@Test
	public void testTotalPercibido() {
		assertEquals(0.0, trabajador.getTotalPercibido());
		trabajador.agregarIngreso(porHijos);
		trabajador.agregarIngresoHsExtras(hsExtras);
		assertEquals(4000, trabajador.getTotalPercibido());
	}
	
	@Test
	public void testMontoImponible() {
		assertEquals(0.0, trabajador.getMontoImponible());
		trabajador.agregarIngreso(porHijos);
		trabajador.agregarIngresoHsExtras(hsExtras);
		assertEquals(2000, trabajador.getMontoImponible());
	}
	
	@Test
	public void testImpuestoAPagar() {
		assertEquals(0.0, trabajador.getImpuestoAPagar());
		trabajador.agregarIngreso(porHijos);
		trabajador.agregarIngresoHsExtras(hsExtras);
		assertEquals(40, trabajador.getImpuestoAPagar());
	}
}
