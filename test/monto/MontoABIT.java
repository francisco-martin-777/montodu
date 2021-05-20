/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author duarte_martin
 */
public class MontoABIT {

	// La instancia a usar en cada uno de los test la declaramos aqui, con
	// modificador private ya que solo es necesario que tenga visibilidad dentro de
	// esta clase
	private Monto instance;

	public MontoABIT() {
		System.out.println("aqui se ejecuta el constructor");
	}

	@BeforeClass
	public static void setUpClass() {
		System.out.println("este se ejecutaria al principio de todo y solo 1 vez");

	}

	@AfterClass
	public static void tearDownClass() {
		System.out.println("este se ejecutaria al final de todo");
	}

	@Before
	public void setUp() {
		System.out.println("En Before Test se crea la instancia sobre la que se ejecutara el test");
		instance = new Monto();
	}

	@After
	public void tearDown() {
		System.out.println("Despues de cada test 'destruimos' la instancia sobre que se ha hecho el test");
		instance = null;
	}

	/**
	 * Test of ingreso method, of class Monto.
	 */
	@Test
	public void testMonto1() {

		System.out.println("  la cantidad introducida es menor de 1"
				+ "monto1: equivalencia: si el monto es menor de 1,ahora 0, el mensaje seria:\n");
		int cantidad = 0;

		String expResult = "Error: La cantidad introducida es menor de 1";
		String result = instance.ingreso(cantidad);
		assertEquals(expResult, result);

	}

	@Test
	public void testMonto2() {

		System.out.println("monto2: equivalencia: si el monto es de 450(enre 1y1000) el mensaje seria:\n"
				+ "                        valor introducido correcto");
		int cantidad = 450;

		String expResult = "Valor introducido correcto";
		String result = instance.ingreso(cantidad);
		assertEquals(expResult, result);
	}

	@Test
	public void testMonto3() {

		System.out.println("monto3:equivalencia: si el monto es de 1100(mayor de 1000)el mensaje seria:\n"
				+ "                        la cantidad introducida es mayor de 1000");
		int cantidad = 1100;

		String expResult = "Error: La cantidad introducida es > 1000";
		String result = instance.ingreso(cantidad);
		assertEquals(expResult, result);
	}

	@Test
	public void testMonto4() {

		System.out.println("monto4:valores limite:si el monto es de 1 el mensaje seria:\n"
				+ "                        valor introducido correcto");
		int cantidad = 1;

		String expResult = "Valor introducido correcto";
		String result = instance.ingreso(cantidad);
		assertEquals(expResult, result);
	}

	@Test
	public void testMonto5() {

		System.out.println("monto5:valores limites: si el monto es de 1000 el mensaje seria:\n"
				+ "                        valor introducido es correcto");
		int cantidad = 1000;

		String expResult = "Valor introducido correcto";
		String result = instance.ingreso(cantidad);
		assertEquals(expResult, result);
	}
}
