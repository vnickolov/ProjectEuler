package main.problem2;

import java.util.logging.Logger;

import main.shared.Common;

public class EvenFibonacciNumbers {
	private final static Logger LOGGER = Logger
			.getLogger(EvenFibonacciNumbers.class.getName());
	private int max = 0;
	private int total = 0;

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
		this.setMax(max);
		setTotal(0);
		String fib = fibonacci(0, 1);
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		String logMsg = String.format("End\n\tEvenFibonacciNumbers:\n\t"
				+ "Total of even Fibonacci numbers: %s\n\t"
				+ "Less than: %s\n\t" + "Calculated in %s\n\t"
				+ "Fibonacci: %s", getTotal(), max, duration, fib);
		LOGGER.info(logMsg);
	}

	/*
	 * Modified finonacci function to sum all even numbers
	 */
	public String fibonacci(int num1, int num2) {
		int newNum = num1 + num2;
		if (newNum <= getMax()) {
			if (Common.isEven(newNum)) {
				setTotal(getTotal() + newNum);
			}
			return newNum + " " + fibonacci(num2, newNum);
		}
		return "";
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
