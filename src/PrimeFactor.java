import java.util.ArrayList;

/**
 * 
 */

/**
 * TODO Put here a description of what this class does.
 *
 * @author Doolan.
 *         Created Mar 24, 2015.
 */
public class PrimeFactor {

	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
	}
	
	public static ArrayList<Integer> primefactorization(int num){
		ArrayList<Integer> returnval = new ArrayList<Integer>();
		int numtemp = num;
		int[] primes = {2,3,5,7};
		for(int i = 0; i< 4; i++){
			while(numtemp % primes[i] == 0){			
				returnval.add(primes[i]);
				numtemp = numtemp/primes[i];
			}
		}
		if(numtemp>1){
			returnval.add(numtemp);
		}
		return returnval;
	}
}
