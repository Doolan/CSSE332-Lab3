import java.util.ArrayList;

/**
 * 
 */

/**
 * TODO Put here a description of what this class does.
 *
 * @author Steven.
 *         Created Mar 27, 2015.
 */
public class PrimeNumberGenerator {

	public static ArrayList<Integer> primegenerate(int input){
		 ArrayList<Integer> returnArray = new ArrayList<Integer>();
		 if(input<2)
			 return returnArray;
		 for(int i =2; i<input; i++){
			 boolean iIsPrime = true;
			 
			 for(int j = 2; j<i; j++){
				 if(i%j==0){
					 iIsPrime = false;
					 break;
				 }
			 }
			 if(iIsPrime){
				 returnArray.add(i);
			 }
		 }		 
		 return returnArray;		
	}
	
}
