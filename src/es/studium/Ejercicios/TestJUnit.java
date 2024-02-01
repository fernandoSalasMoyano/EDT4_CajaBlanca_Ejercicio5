package es.studium.Ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestJUnit
{

	@Test
	void camino1()
	{
		String resultadoEsperado = CajaBlanca.diasDeMes("Enero");
		String resultadoReal = "Enero tiene: 31 d�as";
		
		assertEquals(resultadoEsperado, resultadoReal);

	}

	@Test
	void camino2()
	{
		String resultadoEsperado = CajaBlanca.diasDeMes("Abril");
		String resultadoReal = "Abril tiene: 30 d�as";
		
		assertEquals(resultadoEsperado, resultadoReal);

	}
	
	@Test
	void camino3()
	{
		String resultadoEsperado = CajaBlanca.diasDeMes("Febrero");
		String resultadoReal = "Febrero tiene: 28 d�as o 29 d�as (en a�o bisiesto)";
		
		assertEquals(resultadoEsperado, resultadoReal);

	}
	@Test
	void camino4()
	{
		String resultadoEsperado = CajaBlanca.diasDeMes("Hola");
		String resultadoReal = "No has especificado un mes v�lido";
		
		assertEquals(resultadoEsperado, resultadoReal);

	}
	
}
