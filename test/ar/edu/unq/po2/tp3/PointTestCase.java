package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PointTestCase {
	private Point point1;
	private Point point2;
	/**
	* Crea un escenario de test 
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea un Point con valores predeterminados en 0
	point1 = new Point();
	//Se crea un Point con valores seteados
	point2 = new Point(1,2);
	}
	/**
	* Mueve un punto a otro punto
	*/
	@Test
	public void testMoverPuntoALaPosicion() {
		//Muevo el punto hacia la posicion (2, 3)
		point1.moverPuntoALaPosicion(2,3);
		// Chequeo si el resultado es el correcto
		assertEquals(point1.getX(), 2);
		assertEquals(point1.getY(), 3);
	}
	@Test
	public void testSumarPuntoAOtroPunto() {
		//Al punto (1,2) le sumo el punto (2,1)
		point2.sumarAlPuntoElPunto(new Point(2,1));
		// Chequeo si el resultado es el correcto
		assertEquals(point2.getX(), 3);
		assertEquals(point2.getY(), 3);
	}

}