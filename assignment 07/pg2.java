import java.util.Scanner;
class Account{
	int acno;
	float balance;
	Account(int a,float b){
		acno=a;
		balance=b;
	}
	void withdraw(int w) {
		balance=balance-w;
	}
	void deposit(int d) {
		balance=balance+d;
	}
}
class Maintain extends Account{
	private float r,t,si=0.0f,amt;
	Maintain(int a,float b) {
		super(a,b);
	}
	void accept(float x,float y) {
		r=x;
		t=y;
		amt=balance;
	}
	void compute() {
		si=(balance*r*t)/100;
		amt=amt+si;
	}
	void display() {
		System.out.println("Account number  :: "+acno);
		System.out.println("Balance :: Rs. "+balance);
		if(si!=0) {
			System.out.println("Total interest  :: Rs. "+si);
			System.out.println("New balance     :: Rs. "+amt);
		}
	}
}
class pg2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter account number  :: ");
		int a=sc.nextInt();
		System.out.print("Enter initial balance :: Rs. ");
		float b=sc.nextFloat();
		System.out.print("Enter time :: ");
		float t=sc.nextFloat();
		Maintain m=new Maintain(a,b);
		int ch;
		m.display();
		while(true) {
			System.out.println("\n\n***WELCOME TO BANKING SYSTEM***");
			System.out.println("1. WITHDRAW\n2. DEPOSIT\n3. SHOW DETAILS\n4. EXIT");
			System.out.print("Enter your choice :: ");
			ch=sc.nextInt();
			System.out.println("\n--------------------------------------");
			switch(ch) {
			case 1:
				System.out.print("Enter withdrawal amount :: Rs. ");
				int w=sc.nextInt();
				m.withdraw(w);
				System.out.println("***AMOUNT WITHDWAWN SUCCESSFULLY***");
				break;
			case 2:
				System.out.print("Enter deposit amount :: Rs. ");
				int d=sc.nextInt();
				m.deposit(d);
				System.out.println("***AMOUNT DEPOSITED SUCCESSFULLY***");
				break;
			case 3:
				System.out.println("Show account details :: ");
				m.accept(3.0f,t);
				m.compute();
				m.display();
				break;
			case 4:
				System.out.println("\n***THANK YOU FOR USING OUR BANKING SYSTEM***");
				System.exit(0);
				break;
			}
		}
	}
}