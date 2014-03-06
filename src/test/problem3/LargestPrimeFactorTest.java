package test.problem3;

import static org.junit.Assert.*;
import main.problem3.LargestPrimeFactor;

import org.junit.Before;
import org.junit.Test;

public class LargestPrimeFactorTest {
	private LargestPrimeFactor testObj;

	@Before
	public void setUp() throws Exception {
		testObj = new LargestPrimeFactor();
	}



	@Test
	public void testIsPrime_number_1_false() {
		boolean actual = testObj.isPrime(1);
		
		assertEquals(false, actual);
	}

	@Test
	public void testIsPrime_number_2_true() {
		boolean actual = testObj.isPrime(2);
		
		assertTrue(actual);
	}

	@Test
	public void testIsPrime_number_5_true() {
		boolean actual = testObj.isPrime(5);
		
		assertTrue(actual);
	}

	@Test
	public void testIsPrime_number_8_false() {
		boolean actual = testObj.isPrime(8);

		assertEquals(false, actual);
	}

	@Test
	public void testIsPrime_number_23_true() {
		boolean actual = testObj.isPrime(23);

		assertTrue(actual);
	}
}
