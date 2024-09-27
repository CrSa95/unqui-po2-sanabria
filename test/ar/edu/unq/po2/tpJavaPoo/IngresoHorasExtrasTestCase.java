package ar.edu.unq.po2.tpJavaPoo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpJavaPoo.IngresoHorasExtras;

public class IngresoHorasExtrasTestCase {
	
	private IngresoHorasExtras hsExtras;
	
	@BeforeEach
	public void setUp() {
		hsExtras = new IngresoHorasExtras("Febrero","Por hijos",2000,20);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(0, hsExtras.getMontoImponible());
	}
}
