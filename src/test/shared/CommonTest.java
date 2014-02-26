package test.shared;

import static org.junit.Assert.*;
import main.shared.Common;

import org.junit.Before;
import org.junit.Test;

public class CommonTest {

	private static final int ODD_NUMBER = 5;
	private static final int EVEN_NUMBER = 4;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCheckIsDivisible_true() {
		boolean actual = Common.checkIsDivisible(10, 5);
		
		assertTrue(actual);
	}

	@Test
	public void testCheckIsDivisible_false() {
		boolean actual = Common.checkIsDivisible(10, 7);
		
		assertEquals(false, actual);
	}

	@Test
	public void testCheckIsEven_true() {
		boolean actual = Common.isEven(EVEN_NUMBER);
		
		assertTrue(actual);
	}

	@Test
	public void testCheckIsEven_false() {
		boolean actual = Common.isEven(ODD_NUMBER);
		
		assertEquals(false, actual);
	}
}
