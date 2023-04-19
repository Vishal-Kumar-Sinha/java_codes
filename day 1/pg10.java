import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class pg10 {
	static void real(double a,double b,double c) {
		DecimalFormat df=new DecimalFormat("#.##");
		if(a==0) System.out.println("Equation doesn't exist..");
		else if((b*b)<(4*a*c)) System.out.println("No real roots exist..");
		else {
			double d=((b*b)-(4*a*c));
			double p=(-b+Math.sqrt(d))/(2*a);
			double q=(-b-Math.sqrt(d))/(2*a);
			System.out.println("The solutions are :: "+df.format(p)+" and "+df.format(q));
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a :: ");
		double a=s.nextDouble();
		System.out.print("Enter b :: ");
		double b=s.nextDouble();
		System.out.print("Enter c :: ");
		double c=s.nextDouble();
		real(a,b,c);
	}
}