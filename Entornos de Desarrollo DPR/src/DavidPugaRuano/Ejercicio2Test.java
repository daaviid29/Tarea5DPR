package DavidPugaRuano;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Ejercicio2Test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("---Inicio de las pruebas---");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("---Final de las pruebas---");
	}
	
	@Test
	void testEj1() {
		assertEquals(4, DavidPugaRuano.ej1(0, 1, 1)); // Camino 1 Camino 1 2 3 4
		assertEquals(4, DavidPugaRuano.ej1(2, 4, 6)); // Camino 2
		assertEquals(4, DavidPugaRuano.ej1(2, 6, 5)); // Camino 3
		assertEquals(6, DavidPugaRuano.ej1(2, 6, 1)); // Camino 4
	}

	@Test
	void testEj2() {
		assertEquals(4, DavidPugaRuano.ej2(0, 1, 3)); // Camino 1
		assertEquals(6, DavidPugaRuano.ej2(2, 4, 6)); // Camino 2
		assertEquals(6, DavidPugaRuano.ej2(2, 6, 5)); // Camino 3
		assertEquals(6, DavidPugaRuano.ej2(2, 6, 1)); // Camino 4
	}

	@Test
	void testEj5() {
		assertEquals(5, DavidPugaRuano.ej5(5, 5)); // Camino 1
		assertEquals(1, DavidPugaRuano.ej5(6, 5)); // Camino 2
		assertEquals(1, DavidPugaRuano.ej5(5, 6)); // Camino 3
	}

	@Test
	void testEj6() {
		assertEquals(-1, DavidPugaRuano.ej6(0, 6, 5)); // Camino 1
		assertEquals(1, DavidPugaRuano.ej6(6, 5, 6)); // Camino 2
		assertEquals(0, DavidPugaRuano.ej6(9, 5, 8)); // Camino 3
		assertEquals(-1, DavidPugaRuano.ej6(5, 6, 6)); // Camino 4
	}

	@Test
	void testEj8() {
		assertEquals(0, DavidPugaRuano.ej8(1, -1)); // Camino 1
		assertEquals(2, DavidPugaRuano.ej8(3, 5)); // Camino 2
		assertEquals(1, DavidPugaRuano.ej8(3, 0)); // Camino 3
	}
}
