package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

		
	@Test
	public void testSuma() {
		int resultado = Calculadora.suma(5, 6); 
		int esperado = 11;
		assertEquals(esperado, resultado);
		
	}
	

}
