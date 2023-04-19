import java.util.Scanner;
import java.io.DataInputStream;

public class pg1 {
	static void br() {
		DataInputStream in=new DataInputStream(System.in);
		try {
			System.out.print("Enter 1st number :: ");
			int a=Integer.parseInt(in.readLine());
			System.out.print("Enter 2nd number :: ");
			int b=Integer.parseInt(in.readLine());
			System.out.println("Buffer reader addition :: "+(a+b));
		} catch(Exception e) {
			
		}
	}
	static void sc() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st number :: ");
		int a=s.nextInt();
		System.out.print("Enter 2nd number :: ");
		int b=s.nextInt();
		System.out.println("Scanner reader addition :: "+(a+b));
	}
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("Command line addition :: "+(a+b));
		sc();
		br();
	}

}
