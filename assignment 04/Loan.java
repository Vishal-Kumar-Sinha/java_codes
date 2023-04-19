import java.util.Scanner;
class Ln{
	private int time;
	private double principal;
	private double rate;
	private double interest;
	private double amt;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the principal :: Rs.");
		principal=sc.nextDouble();
		System.out.print("Enter the time priod :: ");
		time=sc.nextInt();
	}	
	void calculate()
	{
		if(time<=5)
			rate =0.15;
		else if(time>5 && time<=10)
			rate =0.12;
		else if(time>10)
			rate =0.1;
		interest=(principal*rate*time);
		amt=principal+interest;
	}
	void display()
	{
		System.out.println("Principal :: Rs. "+principal+"\nInterest :: Rs. "+interest);
		System.out.println("Amount:: Rs. "+amt);
	}
}
class Loan{
	public static void main(String[]args){
		Ln a=new Ln();
		a.getdata();
		a.calculate();
		a.display();
	}
}
