import java.util.Scanner;
class nonfibo {
	public static int nonfiboo(int n) {
		int a=1,b=2,c=3;
		while(n>0) {
			a=b;
			b=c;
			c=a+b;
			n-=a-1;
		}
		n+=a-1;
		return (n+b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of terms :: ");
		int x=sc.nextInt();
		System.out.print("Non-fibonacci series :: ");
		for(int i=1;i<=x;i++)
			System.out.print("  "+nonfiboo(i));
	}
}