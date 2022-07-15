package calculator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exception.CalculatorException;

class CalculatorTest {

	/*
	 * Para realizar estes testes, utilizei o padrão AAA
	 */

	private Calculator calculator;

	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}

	@Test
	void testSumInteger() {
		// arrange
		int a = 5;
		int b = 3;
		int result = 8;
		// act
		int sum = calculator.sum(a, b);
		// assert
		assertEquals(result, sum);
	}
	
	@Test
	void testSumDouble() {
		// arrange
		double a = 4.0;
		double b = 2.5;
		double result = 6.5;
		// act
		double sum = calculator.sum(a, b);
		// assert
		assertEquals(result, sum);
	}
	
	@Test
	void testSubtractionInteger() {
		// arrange
		int a = 5;
		int b = 3;
		int result = 2;
		// act
		int subtraction = calculator.subtraction(a, b);
		// assert
		assertEquals(result, subtraction);
	}
	
	@Test
	void testSubtractionDouble() {
		// arrange
		double a = 4.0;
		double b = 2.5;
		double result = 1.5;
		// act
		double subtraction = calculator.subtraction(a, b);
		// assert
		assertEquals(result, subtraction);
	}
	
	@Test
	void testMultiplicationInteger() {
		// arrange
		int a = 5;
		int b = 3;
		int result = 15;
		// act
		int multiplication = calculator.multiplication(a, b);
		// assert
		assertEquals(result, multiplication);
	}
	
	@Test
	void testMultiplicationDouble() {
		// arrange
		double a = 3.5;
		double b = 2.5;
		double result = 8.75;
		// act
		double multiplication = calculator.multiplication(a, b);
		// assert
		assertEquals(result, multiplication);
	}
	
	@Test
	void testDivisionInteger() {
		// arrange
		int a = 10;
		int b = 4;
		double result = 2.5;
		// act
		double division = calculator.division(a, b);
		// assert
		assertEquals(result, division);
	}
	
	@Test
	void testDivisionDouble() {
		// arrange
		double a = 3.5;
		double b = 2.5;
		double result = 1.4;
		// act
		double division = calculator.division(a, b);
		// assert
		assertEquals(result, division);
	}
	
	@Test
	void testDivieBy0ExceptionInteger() {
		int a = 10;
		int b = 0;
		// no act
		assertThrows(CalculatorException.class, ()->calculator.division(a, b));
	}
	
	@Test
	void testDivieBy0ExceptionDouble() {
		double a = 10;
		double b = 0;
		// no act
		assertThrows(CalculatorException.class, ()->calculator.division(a, b));
	}
	
	@Test
	void testPow() {
		// arrange
		int a = 3;
		int b = 5;
		int result = 243;
		// act
		int pow = calculator.pow(a, b);
		// assert
		assertEquals(result, pow);
	}
	
	@Test
	void testRoot() {
		// arrange
		double a = 25.0;
		double b = 2.0;
		double result = 5.0;
		// act
		double root = calculator.root(a, b);
		// assertEquals
		assertEquals(result, root);
	}
	
	@Test
	void testaFibonacci0() {
		// arrange
		int a = 0;
		int expectedResult = 0;
		// act
		int actualResult = calculator.fibonacci(a);
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testaFibonacci1() {
		// arrange
		int a = 1;
		int expectedResult = 1;
		// act
		int actualResult = calculator.fibonacci(a);
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testaFibonacci() {
		// arrange
		int a = 10;
		int expectedResult = 55;
		// act
		int actualResult = calculator.fibonacci(a);
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testCheckPrimeNumberPair() {
		// arrange
		int notPrime = 20;
		// act
		boolean resultNotPrime = calculator.checkPrimeNumber(notPrime);
		// assert
		assertFalse(resultNotPrime);
	}
	
	@Test
	void testCheckPrimeNumber2() {
		// arrange
		int prime = 2;
		// act
		boolean resultPrime = calculator.checkPrimeNumber(prime);
		// assert
		assertTrue(resultPrime);
	}
	
	@Test
	void testCheckPrimeNumber() {
		// arrange
		int prime = 11;
		int notPrime = 25;
		// act
		boolean resultPrime = calculator.checkPrimeNumber(prime);
		boolean resultNotPrime = calculator.checkPrimeNumber(notPrime);
		// assert
		assertTrue(resultPrime);
		assertFalse(resultNotPrime);
	}
	
	@Test
	void testCircleArea() {
		// arrange
		double radiusMeters = 2.0;
		double result = 12.566372;
		// act
		double circleArea = calculator.circleArea(radiusMeters);
		// assertEquals
		assertEquals(result, circleArea);
	}
}
