class Myexception extends Exception {
	Myexception(String str) {
		super(str);
		System.out.println("I'm in MYEXCEPTION...");
	}
}
class pg3 {
	static void check(int c) throws Myexception {
		System.out.println("I'm in CHECK...");
		if(c<10) throw new Myexception("Myexp");
		else System.out.println("alright");
	}
	public static void main(String[]args) {
		try {
			System.out.println("I'm in main...");
			check(20);
			System.out.println("After test-1...");
			check(7);
		}
		catch(Exception e) {
			System.out.println("I'm in CATCH \nException :: "+e);
		}
	}
}