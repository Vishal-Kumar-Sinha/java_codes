import java.text.DecimalFormat;
public class pg9 {
	static void si(double p,double t,double r) {
		double d=(p*t*r)/100;
		DecimalFormat df=new DecimalFormat("#.##");
		System.out.println("Simple interest :: Rs. "+df.format(d));
	}
	public static void main(String[] args) {
		double p=Double.parseDouble(args[0]);
		double t=Double.parseDouble(args[1]);
		double r=Double.parseDouble(args[2]);
		si(p,t,r);

	}

}
