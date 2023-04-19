import java.util.Scanner;
import java.lang.Math;
public class pg1 {
	static boolean isprime(int n) {
		if(n==0 || n==1) return false;
		else if(n==2) return true;
		else if(Math.pow(2, (n-1))%n==1) return true;
		return false;
	}
	public static int nthprime(int n) {
		if(n==1) return 2;
        int i=1;
        int count=1;
        while(count!=n){
            i+=2;
            if(isprime(i)) count++;
        }
        return i;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter n :: ");
		int n=s.nextInt();
		System.out.println(n+"th prime number :: "+nthprime(n));
	}

}
