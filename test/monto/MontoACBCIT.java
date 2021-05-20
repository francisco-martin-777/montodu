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

public class MontoACBCIT {

	// El campo Monto ahora debera ser static para permitir su creacion en Before
	// Class al ser un metodo estatico
	private static Monto instance;

	public MontoACBCIT() {
		System.out.println("aqui se ejecuta el constructor");

	}

	@BeforeClass
	public static void setUpClass() {
		System.out.println(
				"En Before Class creamos ahora la instancia, que solo sera una para toda la ejecucion del test");
		instance = new Monto();

	}

	@AfterClass
	public static void tearDownClass() {
		System.out.println("este se ejecutaria al final de todo");
		instance = null;
	}

	@Before
	public void setUp() {
		System.out.println("En Before Test en este caso no realiza ninguna accion");

	}

	@After
	public void tearDown() {
		System.out.println("Despues de cada test no realizamos ninguna accion");

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
