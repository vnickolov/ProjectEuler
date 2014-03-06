package main.problem4;

import java.util.logging.Logger;

public class LargestPalindromeProduct {
	private final static Logger LOGGER = Logger.getLogger(LargestPalindromeProduct.class.getName());
	private int n = 0;


	private long max = 1;
	private int n1Max = 1;
	private int n2Max = 1;

	public LargestPalindromeProduct() {
		
	}
	
	public void run() {
		LOGGER.info("Begin LargestPalindromeProduct");
		/*
		 * Begin timing
		 */
		long startTime = System.nanoTime();
		/*
		 * Do calculations
		 */
		for (int i = 1; i < getN(); i++) {
			for (int j = 1; j < getN(); j++) {
				long f = i * j;
				if ( f > getMax() && isPalindrome(f + "")) {
					setMax(f);
					setN1Max(i);
					setN2Max(j);
				}
			}
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		String logMsg = String.format(
				"End LargestPalindromeProduct Largest Palindrome is: %s where n <: %s and n1 max is: %s n2 max is: %s Calculated in: %s",
				getMax(), getN(), getN1Max(), getN2Max(), duration);
		LOGGER.info(logMsg);
	}
	
	public boolean isPalindrome(String p) {
		if (p == null || p.isEmpty()) {
			return false;
		}
		for (int i = 0; i < p.length(); i++) {
			if ( p.charAt(i) != p.charAt(p.length() - (i + 1))) {
				return false;
			}
		}
		return true;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public long getMax() {
		return max;
	}

	public void setMax(long max) {
		this.max = max;
	}

	public int getN1Max() {
		return n1Max;
	}

	public void setN1Max(int n1Max) {
		this.n1Max = n1Max;
	}

	public int getN2Max() {
		return n2Max;
	}

	public void setN2Max(int n2Max) {
		this.n2Max = n2Max;
	}
}
