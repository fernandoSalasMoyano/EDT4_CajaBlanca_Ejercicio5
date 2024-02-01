package es.studium.Ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestJUnit
{

	@Test
	void camino1()
	{
		String resultadoEsperado = CajaBlanca.diasDeMes("Enero");
		String resultadoReal = "Enero tiene: 31 días";
		
		assertEquals(resultadoEsperado, resultadoReal);

	}

	@Test
	void camino2()
	{
		String resultadoEsperado = CajaBlanca.diasDeMes("Abril");
		String resultadoReal = "Abril tiene: 30 días";
		
		assertEquals(resultadoEsperado, resultadoReal);

	}
	
	@Test
	void camino3()
	{
		String resultadoEsperado = CajaBlanca.diasDeMes("Febrero");
		String resultadoReal = "Febrero tiene: 28 días o 29 días (en año bisiesto)";
		
		assertEquals(resultadoEsperado, resultadoReal);

	}
	@Test
	void camino4()
	{
		String resultadoEsperado = CajaBlanca.diasDeMes("Hola");
		String resultadoReal = "No has especificado un mes válido";
		
		assertEquals(resultadoEsperado, resultadoReal);

	}
	
}
