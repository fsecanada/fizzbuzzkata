package kata.test.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

import kata.FizzBuzz;


public class FizzBuzzTest {

	// The FizzBuzz kata is:
	
	/**
	 * 
	 * "Write a program that prints the numbers from 1 to 100. 
	 * But for multiples of three print “Fizz” instead of the 
	 * number and for the multiples of five print “Buzz”. For 
	 * numbers which are multiples of both three and five print 
	 * “FizzBuzz”."
	 * 
	 */
	
	// Breaking the Kata into features:
	// 1) Write a program that prints the numbers from 1 to 100
	
	
	@Test
	public void TestNumberQuantity() {
		
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.run();
		
		assertEquals(100,fizzBuzz.getNumberLength());
		
	}
	
}
