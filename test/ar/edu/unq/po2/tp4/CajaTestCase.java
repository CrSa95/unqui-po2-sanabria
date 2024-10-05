package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaTestCase {
	private ProductoEmpresaTradicional arroz;
	private ProductoCooperativa miel;
	private FacturaServicios facturaLuz;
	private FacturaImpuestos facturaImp;
	private Caja caja;

	@BeforeEach
	public void setUp() {
		arroz = new ProductoEmpresaTradicional("Arroz", 18.5, 1);
		miel = new ProductoCooperativa("Miel", 20.5, 2);
		caja = new Caja();
		facturaLuz = new FacturaServicios(150.5, 10);
		facturaImp = new FacturaImpuestos(150.5);
		caja.setProducto(arroz);
		caja.setProducto(miel);
	}
	
	@Test
	public void testRegistrarProducto() {
		assertEquals(0, caja.getTotal());
		assertEquals(1, arroz.getStock());
		assertEquals(2, miel.getStock());
		caja.registrarOperacion();
		assertEquals(36.95, caja.getTotal());
		assertEquals(0, arroz.getStock());
		assertEquals(1, miel.getStock());
	}
	
	@Test
	public void testRegistrarFactura() {
		assertEquals(0, caja.getTotal());
		caja.registrarOperacion(facturaLuz);
		caja.registrarOperacion(facturaImp);
		assertEquals(1655.5, caja.getTotal());
	}
}
