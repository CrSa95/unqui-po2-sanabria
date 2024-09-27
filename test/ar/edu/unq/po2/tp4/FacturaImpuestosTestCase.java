package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacturaImpuestosTestCase {
	private FacturaImpuestos facturaImp;
	
	@BeforeEach
	public void setUp() {
		facturaImp = new FacturaImpuestos(150.5);
	}
	
	@Test
	public void testGetMonto() {
		assertEquals(150.5, facturaImp.getMonto());
	}
}
