package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectanguloTestCase {
	private Rectangulo rect1;
	private Rectangulo rect2;
	/**
	* Crea un escenario de test 
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea un Rectangulo con valores seteados
	rect1 = new Rectangulo(new Point(), 2, 1);
	rect2 = new Rectangulo(new Point(), 1, 2);
	}
	/**
	* Mueve un punto a otro punto
	*/
	@Test
	public void testCrearRectangulo() {
		// Chequeo si puedo crear un rectangulo de manera incorrecta
		assertThrows(RectanguloException.class, () -> {new Rectangulo(new Point(), -1, -2);});		
	}
	@Test
	public void testObtenerElArea() {
		//Se obtiene el valor del area del rectangulo
		int area = rect1.calcularArea();
		// Chequeo si el resultado es el correcto
		assertEquals(area, 2);
	}
	@Test
	public void testObtenerElPerimetro() {
		//Se obtiene el valor del perimetro del rectangulo
		int perimetro = rect1.calcularPerimetro();
		// Chequeo si el resultado es el correcto
		assertEquals(perimetro, 6);
	}
	@Test
	public void testEsHorizonal() {
		// Chequeo si el resultado es el correcto
		assertTrue(rect1.esHorizontal());
	}
	@Test
	public void testEsVertical() {
		// Chequeo si el resultado es el correcto
		assertTrue(rect2.esVertical());
	}
}