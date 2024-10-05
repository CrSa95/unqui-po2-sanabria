package ar.edu.unq.po2.tp6Solid;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BancoTestCase {
	
	private Cliente cliente1;
	private Cliente cliente2;
	private Propiedad propiedad;
	private Banco banco; 
	private Credito creditoHipotecario;
	private Credito creditoPersonal;
	
	@BeforeEach
	public void setUp() {
		cliente1 = new Cliente("Cristian","Sanabria","43N2906",29,800000);
		cliente2 = new Cliente("Belen","Cabral","26N755",32,700000);
		propiedad = new Propiedad("CasitaMerlo","Berilo1250",10000000);
		banco = new Banco();
		creditoHipotecario = new CreditoHipotecario(36,5000000,propiedad);
		creditoPersonal= new CreditoPersonal(36,7000000);
	}
	
	@Test
	public void testAgregarUnCliente() {
		assertEquals(0,banco.getClientes().size());
		banco.setCliente(cliente1);
		assertEquals(1,banco.getClientes().size());
		banco.setCliente(cliente2);
		assertEquals(2,banco.getClientes().size());
	}
	
	@Test
	public void testSolicitarCredito() {
		assertEquals(0,banco.getCreditos().size());
		assertTrue(banco.registrarSolicitudCredito(creditoHipotecario, cliente1));
		assertEquals(1,banco.getCreditos().size());
	}
	
	@Test
	public void testMontoTotalCreditos() {
		banco.registrarSolicitudCredito(creditoHipotecario, cliente1);
		banco.registrarSolicitudCredito(creditoPersonal, cliente2);
		assertEquals(12000000,banco.montoTotalCreditos());
	}
}
