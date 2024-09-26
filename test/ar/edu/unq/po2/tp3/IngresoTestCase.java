package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngresoTestCase {
	
	private Ingreso porHijos;
	
	@BeforeEach
	public void setUp() {
		porHijos = new Ingreso("Febrero","Por hijos",2000);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(2000, porHijos.getMontoImponible());
	}
}
