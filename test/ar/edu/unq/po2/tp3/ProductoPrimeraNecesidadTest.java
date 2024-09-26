package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8, 100, false);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(0, leche.getPrecio());
	}
}