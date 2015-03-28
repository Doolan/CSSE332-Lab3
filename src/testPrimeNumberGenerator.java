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
	private Boolean expectedResult;
	private PrimeNumberGenerator primeNumberGenerator;
	
   @Before
   public void initialize() {
	   primeNumberGenerator = new PrimeNumberGenerator();
   }
	
	public PrimeNumberGeneratorTest(Integer inputNumber, Boolean expectedResult) {
	      this.inputNumber = inputNumber;
	      this.expectedResult = expectedResult;
	   }
	
}
