package mathcal;
public class FactGCD {
	public static int calFactorial(int n) {
		int fact=1;
	    for(int i=2;i<=n;i++) {
	        fact=fact*i;
	    }
	    return fact;
	}
	public static int calGCD(int a,int b) {
		int res=0;
		while(b>0) {
			int temp=b;
			b=a%b;
			a=temp;
			res=a;
		}
		return res;
	}
}
