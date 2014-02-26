package main;

import java.util.logging.Logger;

import main.problem1.MultiplesOf3And5;
import main.problem2.EvenFibonacciNumbers;

public class Main {
	private static final int Million_4 = 4000000;
	private final static Logger LOGGER = Logger.getLogger(Main.class.getName()); 

	public static void main(String[] args) {
		LOGGER.info("Problem 1");
		MultiplesOf3And5 m35 = new MultiplesOf3And5(1000);
		m35.run();
	


		LOGGER.info("Problem 2");
		EvenFibonacciNumbers fib = new EvenFibonacciNumbers();
		fib.run(Million_4);

		LOGGER.info("Problem 3");
	}

}
