class MinimumBalanceException extends Exception {
	MinimumBalanceException(String s) {
		super(s);
	}
}
class pg4b {
	static void checkBalance(int bal) throws MinimumBalanceException {
		if(bal<5000) throw new MinimumBalanceException("Not enough balance...");
		else System.out.println("Account balance maintained");
	}
	public static void main(String[]args) {
		try {
			checkBalance(9000);
			checkBalance(500);
		}
		catch(Exception e) {
			System.out.println("Exception :: "+e);
		}
	}
}