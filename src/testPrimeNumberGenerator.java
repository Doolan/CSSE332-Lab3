import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
 


import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * 
 */

/**
 * TODO Put here a description of what this class does.
 *
 * @author Steven.
 *         Created Mar 27, 2015.
 */
@RunWith(Parameterized.class)
public class testPrimeNumberGenerator {
	private Integer inputNumber;
	private ArrayList<Integer> expectedResult;
	private PrimeNumberGenerator primeNumberGenerator;
	
   @Before
   public void initialize() {
	   primeNumberGenerator = new PrimeNumberGenerator();
   }
	
	public testPrimeNumberGenerator(Integer inputNumber, ArrayList<Integer> expectedResult) {
	      this.inputNumber = inputNumber;
	      this.expectedResult = expectedResult;
	   }
	
   @Parameterized.Parameters
   public static Collection primeNumbers() {
	   ArrayList<Integer> one = new ArrayList<Integer>();
	   ArrayList<Integer> two = new ArrayList<Integer>();
	   two.add(2);
	   two.add(3);
      return Arrays.asList(new Object[][] {
    		  {0, one},
    		  {1, one},
    		  {2, one},
    		  {4, two}
      });
   }	
	
	@Test
	public void testPrimeNumberChecker(){
		System.out.println("Parameterized Number is : " + inputNumber);
		assertArrayEquals(expectedResult.toArray(),PrimeNumberGenerator.primegenerate(inputNumber).toArray());
	}
	
}
