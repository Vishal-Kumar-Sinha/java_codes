import java.util.Scanner;
class prime {
	public static boolean isprime(int n) {
		if(n==0||n==1)
			return false;
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter upper limit of range :: ");
		int x=sc.nextInt();
		System.out.print("Prime series :: ");
		for(int i=0;i<x;i++) {
			if(isprime(i))
				System.out.print(i+" ");
		}
	}
}