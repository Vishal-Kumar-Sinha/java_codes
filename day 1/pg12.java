import java.util.Scanner;
public class pg12 {
	static int Gcd(int a,int b) {
		int gcd=1;
		for(int i=1;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0)
				gcd=i;
		}
		return gcd;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st number :: ");
		int a=s.nextInt();
		System.out.print("Enter 2nd number :: ");
		int b=s.nextInt();
		System.out.print("GCD of "+a+" & "+b+" :: "+Gcd(a,b));
	}
}