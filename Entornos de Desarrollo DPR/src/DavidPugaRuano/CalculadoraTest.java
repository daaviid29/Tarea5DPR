package DavidPugaRuano;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	Calculadora calculate = new Calculadora();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("---Inicio de las pruebas---");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("---Final de las pruebas---");
	}

	@Test
	void testCalculadora() {
		System.out.println("Casos de prueba de todos los métodos");
		assertEquals(8, calculate.suma(3, 5));
		assertEquals(-2, calculate.resta(3, 5));
		assertEquals(15, calculate.multiplica(3, 5));
		assertEquals(3, calculate.divide(15, 5));
	}

	@Test
	void testSuma() {
		System.out.println("Casos de prueba del método suma");
		assertEquals(2, calculate.suma(1, 1));
		assertNotEquals(3, calculate.suma(1, 1));
	}

	@Test
	void testResta() {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 7);
		}
		for (int i = 0; i < array.length; i++) {
			assertEquals(array[i] - array[i], calculate.resta(array[i], array[i]));
		}
	}
	
	@Test
	void testMultiplicacion() {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		for (int i = 0; i < array.length; i++) {
			assertEquals(array[i] * array[i], calculate.multiplica(array[i], array[i]));
		}
	}
	
	@Test
	public void testDivide() {
		System.out.println("Casos de prueba del método división");
		try {
			assertEquals(0, calculate.divide(15, 0));
		} catch (Exception e) {
			System.out.println("División por 0 producida");
		}
	}

}
