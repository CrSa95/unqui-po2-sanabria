package ar.edu.unq.po2.tpJavaPoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpJavaPoo.ProductoPrimeraNecesidad;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTestCase {

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