class pg1 {
	public static void main(String[]args) {
		try {
			int a[]=new int[2];
			try {
				System.out.println(10/0);
			}
			catch(ArithmeticException e) {
				System.out.println("I'm in ArithmeticException \nException = "+e);
			}
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("I'm in ArrayIndexOutOfBoundsException \nException = "+e);
		}
		catch(Exception e) {
			System.out.println("I'm in Exception \nException = "+e);
		}
	}
}