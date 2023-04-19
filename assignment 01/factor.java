import java.util.Scanner;
class factor {
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
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number :: ");
		int x=sc.nextInt();
		System.out.print("Prime factors are :: ");
		for(i=1;i<=x;i++) {
			if(x%i==0 && isprime(i))
				System.out.print(i+" ");
		}
	}
}