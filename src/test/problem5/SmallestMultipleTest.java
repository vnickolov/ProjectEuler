package test.problem5;

import static org.junit.Assert.*;
import main.problem5.SmallestMultiple;

import org.junit.Before;
import org.junit.Test;

public class SmallestMultipleTest {
	private SmallestMultiple testObj;

	@Before
	public void setUp() throws Exception {
		testObj =  new SmallestMultiple();
	}

	@Test
	public final void run_project_euler_example_test() {
		testObj.setDevideUpTo(10);
		testObj.run();

		assertEquals(2520, testObj.getN());
	}

}
