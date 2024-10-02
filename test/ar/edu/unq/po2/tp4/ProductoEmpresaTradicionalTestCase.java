package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoEmpresaTradicionalTestCase {
	private ProductoEmpresaTradicional arroz;
	
	@BeforeEach
	public void setUp() {
		arroz = new ProductoEmpresaTradicional("Arroz", 18.9d, 1);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Arroz", arroz.getNombre());
		assertEquals(18.9, arroz.montoAPagar());
		assertEquals(1,arroz.getStock());
	}
	
	@Test
	public void testDecrementarStock() {
		arroz.decrementarStock();
		assertEquals(0, arroz.getStock());
	}
}
