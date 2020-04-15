package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

		
	@Test
	public void testSuma() {
		int resultado = Calculadora.suma(2, 3); 
		int esperado = 5;
		assertEquals(esperado, resultado);
		
	}
	

}
