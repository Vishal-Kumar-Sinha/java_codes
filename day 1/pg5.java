
public class pg5 {
	static void digits(int m) {
		int sum=0,r;
		while(m>0) {
			r=m%10;
			sum+=r;
			m=m/10;
		}
		System.out.println("Sum of digits :: "+sum);
	}
	static void reverse(int m) {
		int rev=0,r;
		while(m>0) {
			r=m%10;
			rev=(rev*10)+r;
			m=m/10;
		}
		System.out.println("Reverse of the number :: "+rev);
	}
	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		digits(x);
		reverse(x);
	}

}
