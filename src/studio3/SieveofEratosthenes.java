package studio3;
import java.util.Scanner;

public class SieveofEratosthenes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Primes up to what number: ");
		int n = in.nextInt();	
		boolean [] primes = new boolean [n+1];
		for (int i=0; i<primes.length; i++) {			
			primes [i] = true;
		}
		
		
		
		for (int j=2; j<(primes.length/2); j++) {
			for (int k=2*j; k<(primes.length); k=k+j) {
				primes [k] = false;
		}}
	
		
		for (int i=0; i<primes.length; i++) {			
		if (primes [i] == true) {
		System.out.println(i);
	}
		}
		
		
		
		
		
		// start at 2 multiply by 1,2,3,4,5,6,7
		//then do 3 and multiply by 1,2,3,4,5,6,7
			//all of those will be bad values
		//	set is false
			//if numberisprime = true keep in the index
		//	else remove it

	}

}
