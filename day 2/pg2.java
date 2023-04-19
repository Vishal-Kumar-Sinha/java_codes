import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

class Cylinder {
	double r,h;
	DecimalFormat df=new DecimalFormat("#.##");
	Cylinder(double r,double h) {
		this.h=h;
		this.r=r;
		double a=(2*Math.PI*r)*(r+h);
		double v=(Math.PI*r*r*h);
		System.out.println("Area of the cylinder :: "+df.format(a));
		System.out.println("Volume of the cylinder :: "+df.format(v));
	}
}
public class pg2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter radius :: ");
		double r=s.nextDouble();
		System.out.print("Enter height :: ");
		double h=s.nextDouble();
		Cylinder c=new Cylinder(r,h);
	}
}