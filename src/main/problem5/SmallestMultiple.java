package main.problem5;

import java.util.logging.Logger;

import main.shared.Common;

public class SmallestMultiple {
	private final static Logger LOGGER = Logger.getLogger(SmallestMultiple.class.getName());
	/*
	 * smallest multiple divided by numbers 0 - smallestMl
	 */
	private int devideUpTo = 0;
	private int n = 0;

	public SmallestMultiple() {
		
	}
	
	public void run() {
		LOGGER.info("Begin SmallestMultiple");
		/*
		 * Begin timing
		 */
		long startTime = System.nanoTime();
		boolean isDivisible = true;
		setN(getDevideUpTo() - 1); //offset as we add 1 first thing in loop
		do {
			isDivisible = true;
			setN(getN() + 1);
			for (int i = 1; i < getDevideUpTo() && isDivisible; i++) {
				if (!Common.isEven(getN()) || !Common.checkIsDivisible(getN(), i)) {
					isDivisible = false;
				}
			}
 		} while (!isDivisible);
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		final String logMsg = String.format("End SmallestMultiple: %s is the smallest number that can be divided by each of the numbers from 1 to %s without any remainder. Duration: %s", getN(), getDevideUpTo(), duration);    
		LOGGER.info(logMsg);
	}

	public int getDevideUpTo() {
		return devideUpTo;
	}

	public void setDevideUpTo(int devideUpTo) {
		this.devideUpTo = devideUpTo;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}
