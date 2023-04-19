public class pg6 {
	public static int Facto(int n) {
		if(n>=1) return n*Facto(n-1);
		else return 1;
	}
	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		System.out.println("Factorial of "+x+" is :: "+Facto(x));
	}
}