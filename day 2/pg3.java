import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

class Cone {
	double r,h;
	DecimalFormat df=new DecimalFormat("#.##");
	Cone(double r,double h) {
		this.h=h;
		this.r=r;
		double z=((r*r)+(h*h));
		double a=(Math.PI*r)*(r+(Math.sqrt(z)));
		double v=(Math.PI*r*r*h/3);
		System.out.println("Area of the cone :: "+df.format(a));
		System.out.println("Volume of the cone :: "+df.format(v));
	}
}
public class pg3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter radius :: ");
		double r=s.nextDouble();
		System.out.print("Enter height :: ");
		double h=s.nextDouble();
		Cone c=new Cone(r,h);
	}
}