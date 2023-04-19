
public class pg4 {
	static int x;
	static void show() {
		System.out.println("Value :: "+x);
	}
	public static void main(String[] args) {
		x=Integer.parseInt(args[0]);
		show();
	}
}