class checkpg5 {
	int x;
	checkpg5(int x) {
		this.x=x;
	}
	void show() {
		System.out.println("Value :: "+x);
	}
}
public class pg5 {
	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		checkpg5 c=new checkpg5(x);
		c.show();
	}
}