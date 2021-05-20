/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monto;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author duarte_martin
 */
@RunWith(Parameterized.class)
public class MontoParamIT {

	// Campo que se usara para el valor a introducir en el test
	private int monto;
	// Campo que usaremos para comprar el resultado de la ejecucion
	private String resultado;

	public MontoParamIT(int monto, String resultado) {
		this.monto = monto;
		this.resultado = resultado;
	}

	/**
	 * Aqui generamos los datos de prueba
	 * 
	 * @return
	 */
	@Parameters
	public static Iterable<Object> generarDatosTest() {
		List<Object> obj = new ArrayList<>();

		obj.add(new Object[] { 0, "Error: La cantidad introducida es menor de 1" });
		obj.add(new Object[] { 450, "Valor introducido correcto" });
		obj.add(new Object[] { 1100, "Error: La cantidad introducida es > 1000" });
		obj.add(new Object[] { 1, "Valor introducido correcto" });
		obj.add(new Object[] { 1000, "Valor introducido correcto" });

		return obj;
	}

	/**
	 * Test parametrizado
	 */
	@Test
	public void testMontoParametrizado() {

		System.out.println(
				"  la cantidad introducida es " + monto + " por lo tanto el resultado esperado es: " + resultado);
		Monto instance = new Monto();
		String result = instance.ingreso(monto);
		assertEquals(resultado, result);

	}
}
