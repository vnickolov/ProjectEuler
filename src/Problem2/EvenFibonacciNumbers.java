package Problem2;

import java.util.logging.Logger;

import Static.Common;

public class EvenFibonacciNumbers {
	private final static Logger LOGGER = Logger
			.getLogger(EvenFibonacciNumbers.class.getName());
	private int max = 0;

	public EvenFibonacciNumbers() {
	}

	public void run(int max) {
		LOGGER.info("Begin EvenFibonacciNumbers");
		/*
		 * Begin timing
		 */
		long startTime = System.nanoTime();
		/*
		 * Do calculations
		 */
		this.max = max;
		fibonacci(0, 1);
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		String logMsg = String.format(
				"End EvenFibonacciNumbers: Fibonacci is: %s Calculated in %s",
				"", duration);
		LOGGER.info(logMsg);
	}

	/*
	 * This function is used to do actual fibonacci
	 */
	// public String fibonacci(int num1, int num2, int x) {
	// if (x > 0 ) {
	// int newNum = num1 + num2;
	// return newNum + " " + fibonacci(num2, newNum, x - 1);
	// }
	// return "";
	// }

	/*
	 * Modified finonacci function to sum all even numbers
	 */
	public void fibonacci(int num1, int num2) {
		int newNum = num1 + num2;
		if (newNum < max) {
			if (Common.isEven(newNum)) {
				
			}
			fibonacci(num2, newNum);
		}
	}
}
