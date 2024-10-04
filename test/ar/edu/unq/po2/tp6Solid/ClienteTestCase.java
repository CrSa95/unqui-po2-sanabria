package ar.edu.unq.po2.tp6Solid;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTestCase {
	
	private Cliente cliente;
	private Propiedad propiedad;
	private Banco banco; 
	private Credito creditoHipotecario;
	
	@BeforeEach
	public void setUp() {
		cliente = new Cliente("Cristian","Sanabria","43N2906",29,800000);
		propiedad = new Propiedad("CasitaMerlo","Berilo1250",10000000);
		banco = new Banco();
		creditoHipotecario = new CreditoHipotecario(36,5000000,propiedad);
	}
	
	@Test
	public void testCrearCliente() {
		assertEquals("Cristian", cliente.getNombre());
		assertEquals("Sanabria", cliente.getApellido());
		assertEquals("43N2906", cliente.getDireccion());
		assertEquals(29, cliente.getEdad());
		assertEquals(800000, cliente.getSueldo());
	}
	
	@Test
	public void testCalcularSueldNetoMensual() {
		assertEquals(800000, cliente.sueldoNetoMensual());
	}
	
	@Test
	public void testCalcularSueldNetoAnual() {
		assertEquals(9600000, cliente.sueldoNetoAnual());
	}
	
	@Test
	public void testAdquirirPropiedad() {
		cliente.setPropiedad(propiedad);
		assertSame(propiedad, cliente.getPropiedad());
	}
	
	@Test
	public void testSolicitarCredito() {
		assertTrue(cliente.solicitarCredito(banco, creditoHipotecario));
	}
}
