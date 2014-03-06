package main;

import java.util.logging.Logger;

import main.problem1.MultiplesOf3And5;
import main.problem2.EvenFibonacciNumbers;
import main.problem3.LargestPrimeFactor;
import main.problem4.LargestPalindromeProduct;
import main.problem5.SmallestMultiple;

public class Main {
	private static final long _600851475143L = 600851475143L;
	private static final int Million_4 = 4000000;
	private final static Logger LOGGER = Logger.getLogger(Main.class.getName()); 

	public static void main(String[] args) {
		int run = 5;
		switch (run) {
		case 1:
			LOGGER.info("Problem 1");
			MultiplesOf3And5 m35 = new MultiplesOf3And5(1000);
			m35.run();
//			INFO: End Multiples_of_3_and_5: Total is: 233168 between 0 and 1000 Calculated in 1247000
			break;
		case 2:
			LOGGER.info("Problem 2");
			EvenFibonacciNumbers fib = new EvenFibonacciNumbers();
			fib.run(Million_4);

//			EvenFibonacciNumbers:
//			Total of even Fibonacci numbers: 4613732
//			Less than: 4000000
//			Calculated in 297000
//			Fibonacci: 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269 2178309 3524578 
			break;
		case 3:
			LOGGER.info("Problem 3");
			LargestPrimeFactor lpf = new LargestPrimeFactor();
			lpf.run(_600851475143L);
//			INFO: End LargestPrimeFactor Largest Prime Factor of: 600851475143 is: 6857 Calculated in 7805436179000:
			break;
		case 4:
			LOGGER.info("Problem 4");
			LargestPalindromeProduct lpp = new LargestPalindromeProduct();
			lpp.setN(1000);
			lpp.run();
//			INFO: End LargestPalindromeProduct Largest Palindrome is: 906609 where n <: 1000 and n1 max is: 913 n2 max is: 993 Calculated in: 68795000
			break;
		case 5:
			LOGGER.info("Problem 5");
			SmallestMultiple sm = new SmallestMultiple();
			sm.setDevideUpTo(20);
			sm.run();
//1st			INFO: End SmallestMultiple: 232792560 is the smallest number that can be divided by each of the numbers from 1 to 20 without any remainder. Duration: 10957599000
//2nd			INFO: End SmallestMultiple: 232792560 is the smallest number that can be divided by each of the numbers from 1 to 20 without any remainder. Duration: 7980869000
			break;
		default:
			LOGGER.info("No problem selected");
			break;
		}

	}

}
