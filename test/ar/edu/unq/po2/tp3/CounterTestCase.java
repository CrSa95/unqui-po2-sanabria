package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	private Counter counter;
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
	counter = new Counter();
	//Se agregan los numeros. Un solo par y nueve impares
	counter.addNumber(1);
	counter.addNumber(3);
	counter.addNumber(5);
	counter.addNumber(7);
	counter.addNumber(9);
	counter.addNumber(345613);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(4);
	counter.addNumber(224466);
	}
	/**
	* Verifica la cantidad de impares
	*/
	@Test
	public void testNumerosImpares() {
		// Obtengo la cantidad de impares
		int cantidadImpares = counter.contarImpares();
		// Chequeo la cantida de impares
		assertEquals(cantidadImpares, 9);
	}
	@Test
	public void testNumerosPares() {
		// Obtengo la cantidad de pares
		int cantidadPares = counter.contarPares();
		// Chequeo la cantida de pares
		assertEquals(cantidadPares, 2);
	}
	@Test
	public void testMultiplosDeUnNumero() {
		// Obtengo la cantidad de multiplos de un numero dado
		int cantidadMultiplos = counter.contarLosMultiplosDeEnLaLista(2);
		// Chequeo la cantidad de multiplos de un numero dado
		assertEquals(cantidadMultiplos, 2);
	}
	@Test
	public void testNumeroConMasDigitosEnLaLista() {
		int numeroConMasDigitosEnLaLista = counter.numeroConMasDigitosEnLaLista();
		assertEquals(numeroConMasDigitosEnLaLista, 224466);		
	}
	@Test
	public void testMultiploDeDosNumeros() {
		int mutiploDeAmbosNumeros = counter.multiploDeDosNumeros(3, 9);
		assertEquals(mutiploDeAmbosNumeros, 999);		
	}
	@Test
	public void testStrings() {
		counter.clasePruebaString();;		
	}
}