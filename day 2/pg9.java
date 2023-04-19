import java.util.Scanner;

class Bank {
	String name,address;
	int p,accno;
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter account no. :: ");
		accno=s.nextInt();
		System.out.println("Enter name :: ");
		name=s.nextLine();
		System.out.println("Enter prinpipal :: Rs. ");
		p=s.nextInt();
		System.out.print("Enter address :: ");
		address=s.nextLine();
	}
	void deposit() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter amount :: Rs. ");
		int x=s.nextInt();
		p=p+x;
	}
	void withdraw() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter amount :: Rs. ");
		int a=s.nextInt();
		if(p<a) System.out.println("Not enough balance...");
		else {
			p=p-a;
			System.out.println("Withdrawn successfully...");
			System.out.println("Remaining balance :: Rs. "+p);
		}
	}
	void display() {
		System.out.println("Account number  :: "+accno);
		System.out.println("Holder's name   :: "+name);
		System.out.println("Holder address  :: "+address);
		System.out.println("Account balance :: "+p);
	}
}
public class pg9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Bank b=new Bank();
		b.input();
		System.out.println("1.Deposit  2.Withdraw  3.Display  4.Exit");
		System.out.print("Enter your choice :: ");
		int ch=s.nextInt();
		while(true) {
			if(ch==1) {
				b.deposit();
				break;
			}
			else if(ch==2) {
				b.withdraw();
			}
			else if(ch==3) {
				b.display();
			}
			else if(ch==4) {
				System.exit(0);
			}
			else {
				System.out.println("Invalid choice...");
			}
		}
	}
}