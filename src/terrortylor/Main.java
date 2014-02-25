package terrortylor;

import java.util.logging.Logger;

import Problem1.MultiplesOf3And5;
import Problem2.EvenFibonacciNumbers;

public class Main {
	private final static Logger LOGGER = Logger.getLogger(Main.class.getName()); 

	public static void main(String[] args) {
		LOGGER.info("Begin main");
		LOGGER.info("Problem 1");
		MultiplesOf3And5 m35 = new MultiplesOf3And5(1000);
		m35.run();
	


		LOGGER.info("Problem 2");
		EvenFibonacciNumbers fib = new EvenFibonacciNumbers();
		fib.run(10);
		LOGGER.info("End main");
	}

}
