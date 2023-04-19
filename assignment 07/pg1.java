import java.util.Scanner;
class Sale{
	private String title,author,publication;
	double price;
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter book name :: ");
		title=s.nextLine();
		System.out.print("Enter author name :: ");
		author=s.nextLine();
		System.out.print("Enter publication name :: ");
		publication=s.nextLine();
		System.out.print("Enter book price :: Rs. ");
		price=s.nextDouble();
	}
	void display() {
		System.out.println("\n\n----------------------------------");
		System.out.println("Book name   :: "+title+"\nAuthor name :: "+author+"\nPublication :: "+publication+"\nBook price  :: Rs. "+price);
		System.out.println("----------------------------------");
	}
}
class Purchase extends Sale{
	private int noc;
	private double amt;
	void accept() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of copies :: ");
		noc=s.nextInt();
	}
	void calculate() {
		amt=super.price*noc;
	}
	void showdata() {
		System.out.println("Copies purchased :: "+noc+"\nTotal price 	 :: Rs. "+amt);
		System.out.println("----------------------------------\n");
	}
}
class pg1 {
	public static void main(String[] args) {
		Purchase a=new Purchase();
		a.input();
		a.accept();
		a.calculate();
		a.display();
		a.showdata();
	}
}