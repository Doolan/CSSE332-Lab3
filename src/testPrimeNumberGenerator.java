import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
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
	
	public PrimeNumberGeneratorTest(Integer inputNumber, ArrayList<Integer> expectedResult) {
	      this.inputNumber = inputNumber;
	      this.expectedResult = expectedResult;
	   }
	
   @Parameterized.Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         { 2, true },
         { 6, false },
         { 19, true },
         { 22, false },
         { 23, true }
      });
   }	
	
	@Test
	public void testPrimeNumberChecker(){
		System.out.println("Parameterized Number is : " + inputNumber);
	   
	}
	
}
