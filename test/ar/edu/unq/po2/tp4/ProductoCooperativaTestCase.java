package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoCooperativaTestCase {
	private ProductoCooperativa miel;
	
	@BeforeEach
	public void setUp() {
		miel = new ProductoCooperativa("Miel", 20.5, 2);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Miel", miel.getNombre());
		assertEquals(18.45, miel.montoAPagar());
		assertEquals(2,miel.getStock());
	}
	
	@Test
	public void testDecrementarStock() {
		miel.decrementarStock();
		assertEquals(1, miel.getStock());
	}
}
