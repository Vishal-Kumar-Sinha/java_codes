import java.util.Scanner;
class Temperature {
	void FtoC(double f) {
		double c=(f-32)*5/8;
		System.out.println("Temperature in Celsius is :: "+c);
	}
}
public class pg3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Temperature in Fahrenheit :: ");
		double d=s.nextDouble();
		Temperature t=new Temperature();
		t.FtoC(d);
	}

}
