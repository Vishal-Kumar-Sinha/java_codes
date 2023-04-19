class pg2 {
	public static void main(String[]args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("I'm in ArithmeticException \nException = "+e);
		}
		finally {
			System.out.println("I'm in finally block...");
		}
	}
}