package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultioperadorTestCase {
	private Multioperador multioperador;
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el multioperador
	multioperador = new Multioperador();
	//Se agregan los numeros
	multioperador.addNumber(1);
	multioperador.addNumber(3);
	multioperador.addNumber(5);
	}
	/**
	* Suma todos los numeros de una lista entre si
	*/
	@Test
	public void testSumaTodosLosNUmeros() {
		// Obtengo el resultado de sumar todos los componentes
		int sumaTotal = multioperador.sumarTodosLosNumerosDeLista();
		// Chequeo si el resultado es el correcto
		assertEquals(sumaTotal, 9);
	}
	@Test
	public void testRestaTodosLosNUmeros() {
		// Obtengo el resultado de restar todos los componentes
		int restaTotal = multioperador.restarTodosLosNumerosDeLista();
		// Chequeo si el resultado es el correcto
		assertEquals(restaTotal, -9);
	}
	@Test
	public void testMultiplicaTodosLosNumeros() {
		// Obtengo el resultado de multiplicar todos los componentes
		int multiTodos = multioperador.multiplicarTodosLosNumerosDeLista();
		// Chequeo si el resultado es el correcto
		assertEquals(multiTodos, 15);
	}

}