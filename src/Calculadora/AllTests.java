package Calculadora;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value= Suite.class)
@Suite.SuiteClasses( {CalculadoraTest.class, CalculadoraParametro.class
		      })
public class AllTests {

}
