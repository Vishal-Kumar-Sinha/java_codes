import java.util.Scanner;
public class pg11 {
	static boolean isPrime(int n) {
		if(n==0 || n==1)return false;
		for(int i=2;i<n;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter lower limit :: ");
		int a=s.nextInt();
		System.out.print("Enter upper limit :: ");
		int b=s.nextInt();
		if(b<=a) {
			System.out.println("Invalid input...");
			System.exit(0);
		}
		for(int i=a;i<=b;i++) {
			if(isPrime(i)) System.out.print(" "+i);
		}
	}
}
