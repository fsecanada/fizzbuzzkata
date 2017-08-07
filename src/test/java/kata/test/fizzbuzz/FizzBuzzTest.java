package kata.test.fizzbuzz;

import static org.junit.Assert.*;

import java.util.Random;

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
	
	// 2) But for multiples of three print “Fizz” instead of the number
	@Test
	public void TestMultiplesOfThree() {
		
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.run();
		Random r = new Random();
		// There are 33 multiples of three within the defined range (1 to 100)
		int multipleOfThree = r.ints(1, 33 + 1).findFirst().getAsInt() * 3;
		assertTrue(fizzBuzz.getValueForPosition(multipleOfThree).toString().contains("Fizz"));
		
	}
	
	// 3) and for the multiples of five print “Buzz”
	@Test
	public void TestMultiplesOfFive() {
		
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.run();
		Random r = new Random();
		// There are 20 multiples of five within the defined range (1 to 100)
		int multipleOfFive = r.ints(1, 20 + 1).findFirst().getAsInt() * 5;
		assertTrue(fizzBuzz.getValueForPosition(multipleOfFive).toString().contains("Buzz"));
		
	}
	
	// 4)  For numbers which are multiples of both three and five print “FizzBuzz”."
	@Test
	public void TestMultiplesOfFifteen() {
		
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.run();
		Random r = new Random();
		// There are 6 multiples of fifteen within the defined range (1 to 100)
		int multipleOfFive = r.ints(1, 6 + 1).findFirst().getAsInt() * 15;
		assertTrue(fizzBuzz.getValueForPosition(multipleOfFive).toString().equals("FizzBuzz"));
		
	}
	
	// This is the final code for the definition of a FizzBuzz exercise for the extra work of Software Craftmanship.
	
}
