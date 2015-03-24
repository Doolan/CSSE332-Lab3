import static org.junit.Assert.*;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Test;

/**
 * 
 */

/**
 * TODO Put here a description of what this class does.
 *
 * @author Doolan.
 *         Created Mar 24, 2015.
 */
public class PrimeFactorTest {

	@Test
	public final void test1ReturnsEmpty() {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		assertArrayEquals(answer.toArray(),PrimeFactor.primefactorization(1).toArray());
	}

	@Test
	public final void test2Returns2() {
		int[] answer ={2};
		assertEquals(PrimeFactor.primefactorization(2), answer);
	}
}
