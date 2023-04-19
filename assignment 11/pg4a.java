class VoterAgeValidationException extends Exception {
	VoterAgeValidationException(String str) {
		super(str);
	}
}
class pg4a {
	static void validate(int age) throws VoterAgeValidationException {
		if(age<18) throw new VoterAgeValidationException("Age not valid...");
		else System.out.println("Welcome to vote...");
	}
	public static void main(String[]args) {
		try {
			validate(20);
			validate(12);
		}
		catch(Exception e) {
			System.out.println("Exception :: "+e);
		}
	}
}