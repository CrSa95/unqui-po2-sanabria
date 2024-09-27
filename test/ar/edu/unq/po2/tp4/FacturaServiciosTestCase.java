package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacturaServiciosTestCase {
	private FacturaServicios facturaLuz;
	
	@BeforeEach
	public void setUp() {
		facturaLuz = new FacturaServicios(150.5, 10);
	}
	
	@Test
	public void testGetMonto() {
		assertEquals(1505, facturaLuz.getMonto());
	}
}
