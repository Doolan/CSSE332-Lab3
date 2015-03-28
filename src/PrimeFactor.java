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
		while(numtemp % 2 == 0){			
			returnval.add(2);
			numtemp = numtemp/2;
		}
		numtemp = num;
		while(numtemp % 3 == 0){
			returnval.add(3);
			numtemp = numtemp/3;
		}
		return returnval;
	}
}
