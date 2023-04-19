import java.util.Scanner;
public class pg7 {
	static int Fibo(int n) {
		if(n<=1) {
			return n;
		}
		return Fibo(n-1)+Fibo(n-2);
	}
	public static void main(String[] args) {
		System.out.print("Enter n-th term :: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print(" "+Fibo(i));;
		}
	}

}
