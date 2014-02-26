package main.problem1;

import java.util.logging.Logger;

import main.shared.Common;

public class MultiplesOf3And5 {
	private final static Logger LOGGER = Logger.getLogger(MultiplesOf3And5.class.getName());

	private int upTo = 10;

	public MultiplesOf3And5(int upTo) {
		this.upTo = upTo;
	}
	
	public void run() {
		LOGGER.info("Begin Multiples_of_3_and_5");
		/*
		 * Begin timing
		 */
		long startTime = System.nanoTime();
		/*
		 * Do calculations
		 */
		int total = 0;
		for (int i = 0; i < upTo; i++) {
			if (Common.checkIsDivisible(i, 3) || Common.checkIsDivisible(i, 5)) {
				total += i;
			}
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		final String logMsg = String.format("End Multiples_of_3_and_5: Total is: %s between 0 and %s Calculated in %s", total, upTo, duration);    
		LOGGER.info(logMsg);
	}
}
