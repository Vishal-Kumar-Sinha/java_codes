import java.util.Scanner;
import java.text.DecimalFormat;
class Series {
	void ca(int n) {
		DecimalFormat df=new DecimalFormat("#.##");
		double sum=0;
		for(int i=1;i<=n;i++) {
			sum+=(1.0/i);
		}
		System.out.println("Sum of the series :: "+df.format(sum));
	}
}
public class pg4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of n :: ");
		int d=s.nextInt();
		Series x=new Series();
		x.ca(d);
	}

}
