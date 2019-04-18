package at.fhj.iit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calc;

	/**
	 * inits Calculator with CalculatorImpl
	 */
	@Before
	public void setup(){

		// SETUP PHASE
		calc = new CalculatorImpl();
	}

	@Test
	public void testAdd() {

		// EXERCISE PHASE
		double value = calc.add(5, 2);

		// VERIFY PHASE
		assertEquals(7, value, 0.001);
	}

	/**
	 * tests calculator function add
	 * use the function
	 * use assertEquals to verify the result
	 */
	@Test
	public void testAdd2() {
		double val = calc.add(-3, 0);

		assertEquals(-3, val, 0.001);
	}

	@Test
	public void testAdd3() {
		double val = calc.add(23, -5);

		assertEquals(18, val, 0.001);
	}

	/**
	 * tests calculator function minus
	 * use the function
	 * use assertEquals to verify the result
	 */
	@Test
	public void testMinus() {
		double val = calc.minus(10,2);

		assertEquals(8, val, 0.001);
	}

	@Test
	public void testMinus2() {
		double val = calc.minus(50,25);

		assertEquals(25, val, 0.001);
	}

	@Test
	public void testMinus3() {
		double val = calc.minus(6,20);

		assertEquals(-14, val, 0.001);
	}

	/**
	 * tests calculator function multiply
	 * use the function
	 * use assertEquals to verify the result
	 */
	@Test
	public void testMultiply() {
		double val = calc.multiply(5,5);

		assertEquals(25, val, 0.001);
	}

	@Test
	public void testMultiply2() {
		double val = calc.multiply(9,6);

		assertEquals(54, val, 0.001);
	}

	@Test
	public void testMultiply3() {
		double val = calc.multiply(12,12);

		assertEquals(144, val, 0.001);
	}

	/**
	 * tests calculator function divide
	 * use the function
	 * use assertEquals to verify the result
	 */
	@Test
	public void testDivide() {
		double val = calc.divide(10,2);

		assertEquals(5, val, 0.001);
	}

	@Test
	public void testDivide2() {
		double val = calc.divide(100,10);

		assertEquals(10, val, 0.001);
	}

	@Test
	public void testDivide3() {
		double val = calc.divide(25,2);

		assertEquals(12.5, val, 0.001);
	}


	// VERIFY
	@Test(expected = ArithmeticException.class)
	public void testDivideWithNull(){
		// EXERCISE
		calc.divide(5, 0);
	}
}
