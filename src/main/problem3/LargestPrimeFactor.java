package main.problem3;

import java.util.logging.Logger;

import main.shared.Common;

/*
 * Finds the largest prime number
 * that x is divisible by
 */
public class LargestPrimeFactor {
	private final static Logger LOGGER = Logger.getLogger(LargestPrimeFactor.class.getName());
	
	public LargestPrimeFactor() {
		
	}

	public void run(long x) {
		LOGGER.info("Begin LargestPrimeFactor");
		/*
		 * Begin timing
		 */
		long startTime = System.nanoTime();
		/*
		 * Do calculations
		 */
		long maxPrime = 1;
		boolean found = false;
		for (long i = x; i > 0 && !found; i--) {
//			LOGGER.info("Checking: " + i);
			if (Common.checkIsDivisible(x, i) && isPrime(i)) {
				LOGGER.info("Prime factor found: " + i);
				maxPrime = i;
				found = true;
			}
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		String logMsg = String.format(
				"End LargestPrimeFactor Largest Prime Factor of: %s is: %s Calculated in %s:",
				x, maxPrime, duration);
		LOGGER.info(logMsg);
	}

	public boolean isPrime(long x) {
		if (x <= 1) {
			return false;
		} else if (x > 2 && Common.isEven(x)) {
			return false;
		}
		for (int i = 3; (Math.sqrt(i)) < x && i < x; i += 2) {
			if (Common.checkIsDivisible(x, i)) {
				return false;
			}
		}
		LOGGER.info("Prime found: " + x);
		return true;
	}
}
