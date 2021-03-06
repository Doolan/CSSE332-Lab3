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
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(2);
		assertArrayEquals(answer.toArray(),PrimeFactor.primefactorization(2).toArray());
	}
	
	@Test
	public final void test3Returns3() {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		//answer.add(2);
		answer.add(3);
		assertArrayEquals(answer.toArray(),PrimeFactor.primefactorization(3).toArray());
	}
	@Test
	public final void test4Returns22() {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(2);
		answer.add(2);
		assertArrayEquals(answer.toArray(),PrimeFactor.primefactorization(4).toArray());
	}
	
	@Test
	public final void test6Returns23() {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(2);
		answer.add(3);
		assertArrayEquals(answer.toArray(),PrimeFactor.primefactorization(6).toArray());
	}
	
	@Test
	public final void test8Returns222() {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(2);
		answer.add(2);
		answer.add(2);
		assertArrayEquals(answer.toArray(),PrimeFactor.primefactorization(8).toArray());
	}
	
	@Test
	public final void test9Returns33() {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(3);
		answer.add(3);
		assertArrayEquals(answer.toArray(),PrimeFactor.primefactorization(9).toArray());
	}
	
	@Test
	public final void test325115Returns5771327() {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(5);
		answer.add(7);
		answer.add(7);
		answer.add(1327);
		assertArrayEquals(answer.toArray(),PrimeFactor.primefactorization(325115).toArray());
	}
}
