package test.problem4;

import static org.junit.Assert.*;
import main.problem4.LargestPalindromeProduct;

import org.junit.Before;
import org.junit.Test;

public class LargestPalindromeProductTest {
	private static final int MAX_N_THRESHOLD = 100;
	private static final int MAX_PALINDROME_FACTOR = 9009;
	private static final int N2_MAX = 99;
	private static final int N1_MAX = 91;
	public LargestPalindromeProduct testObj;

	@Before
	public void setUp() throws Exception {
		testObj = new LargestPalindromeProduct();
	}

	@Test
	public final void isPalindrome_check_not_null() {
		boolean actual = testObj.isPalindrome(null);
		
		assertEquals(false, actual);
	}

	@Test
	public final void isPalindrome_check_not_empty() {
		boolean actual = testObj.isPalindrome("");
		
		assertEquals(false, actual);
	}

	@Test
	public final void isPalindrome_even_palindrome() {
		boolean actual = testObj.isPalindrome("anna");
		
		assertTrue(actual);
	}

	@Test
	public final void isPalindrome_even_palindrome_numbers() {
		boolean actual = testObj.isPalindrome("12344321");
		
		assertTrue(actual);
	}

	@Test
	public final void isPalindrome_even_not_palindrome() {
		boolean actual = testObj.isPalindrome("goat");

		assertEquals(false, actual);
	}

	@Test
	public final void isPalindrome_odd_palindrome() {
		boolean actual = testObj.isPalindrome("ana");
		
		assertTrue(actual);
	}

	@Test
	public final void isPalindrome_odd_palindrome_numbers() {
		boolean actual = testObj.isPalindrome("121");
		
		assertTrue(actual);
	}

	@Test
	public final void isPalindrome_odd_not_palindrome() {
		boolean actual = testObj.isPalindrome("goats");

		assertEquals(false, actual);
	}

	@Test
	public final void run_test_from_proet_euler_exampe() {
		testObj.setN(MAX_N_THRESHOLD);
		testObj.run();

		assertEquals(N1_MAX, testObj.getN1Max());
		assertEquals(N2_MAX, testObj.getN2Max());
		assertEquals(MAX_PALINDROME_FACTOR, testObj.getMax());
	}
}
