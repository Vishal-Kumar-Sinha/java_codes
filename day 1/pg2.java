import java.util.Scanner;
import java.text.DecimalFormat;
public class pg2 {
	static void conversion(double d) {
		DecimalFormat df=new DecimalFormat("#");
		double a=d*100;
		System.out.println("Amount in paisa :: "+df.format(a));
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter amount in rupees :: Rs. ");
		double d=s.nextDouble();
		conversion(d);
	}

}
