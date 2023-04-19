package mathcal.mathcheck;
public class Calculations {
	public static boolean isprime(int n) {
 		int i;
 		if(n==0||n==1)
			return false;
 		for(i=2;i<n;i++) {
			if(n%i==0)
   				return false;
 		}
 		return true;
	}
}