package junit;
import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Calculatortest {
	
	Calculator calculator;
	
	// the method annotated with @BeforeEach runs before each test
	
	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}
	
	// a method annotated with @Test defines a test method
	
	@Test
	@DisplayName("Simple multiplication  should work")
	
	void testMultiply() {
		assertEquals(20, calculator.multiply(4, 5), "Regular multiplication should work");
	}
	
	@RepeatedTest(5)
	@DisplayName("Ensure correct")
	
	void testMultiplyWithZero() {
		assertEquals(20, calculator.multiply(4, 5), "Simple multiplication should work");
	}
	
	

}
