package ca.sheridancollege.hainesk.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ca.sheridancollege.hainesk.main.TDDCalc;

class TestTDDCalc {
	// arrange
	TDDCalc calc = new TDDCalc();
	
	@Test
	void testDivideTwoNumbers() {
		
		
		assertEquals(2, calc.divideTwoNumbers(4, 2));
	}
	
	@Test
	void testDivideByZero()
	{
		
		Assertions.assertThrows(ArithmeticException.class, () -> calc.divideTwoNumbers(4, 0));
		
	}

}
