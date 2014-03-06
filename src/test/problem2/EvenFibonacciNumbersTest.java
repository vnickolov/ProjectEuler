package test.problem2;

import static org.junit.Assert.*;
import main.problem2.EvenFibonacciNumbers;
import main.shared.Common;

import org.junit.Before;
import org.junit.Test;

public class EvenFibonacciNumbersTest {
	private static final int SUM_OF_EVEN_FIRST_10_FIBONACCI_NUMBERS = 44;
	private static final int TENTH_FIBONACCI_NUMBER = 89;
	private static final String FIBONACCI_FIRST_10_NUMBERS = "1 2 3 5 8 13 21 34 55 89 ";
	EvenFibonacciNumbers testObj;

	@Before
	public void setUp() throws Exception {
		testObj =  new EvenFibonacciNumbers();
	}

	@Test
	public final void testFibonacci_First_10() {
		testObj.setMax(TENTH_FIBONACCI_NUMBER);
		
		String fibonacci = testObj.fibonacci(0, 1);
		
		assertEquals(SUM_OF_EVEN_FIRST_10_FIBONACCI_NUMBERS, testObj.getTotal());
		assertEquals(FIBONACCI_FIRST_10_NUMBERS, fibonacci);
	}

}
