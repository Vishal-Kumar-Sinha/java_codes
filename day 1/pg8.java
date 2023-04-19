import java.util.Scanner;
import java.lang.Math;

public class pg8 {
	static void series(int x,int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=Math.pow(x, i);
		}
		System.out.println("Sum :: "+sum);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter n :: ");
		int n=s.nextInt();
		System.out.print("Enter x :: ");
		int x=s.nextInt();
		series(x,n);
	}

}
