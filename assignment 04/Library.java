import java.util.Scanner;
class Lib{
	private String name;
	private int price,day;
	private double fine;
	void input(){
		System.out.print("Enter book name :: ");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		System.out.print("Enter book price :: Rs. ");
		price=sc.nextInt();
		System.out.print("Enter days for fine payment :: ");
		day=sc.nextInt();
	}
	void cal(){
		if(day<=7)
			fine=0.25*day;
		if(day>7 && day<=15)
			fine=1.75+0.40*(day-7);	
		if(day>15 && day<=30)
			fine=4.9+0.60*(day-15);	
		if(day>30)
			fine=9+0.80*(day-30);	
	}
	void display(){
		System.out.println("Book name :: "+name+".\nBook price :: Rs. "+price);
		System.out.println("Fine due :: Rs. "+fine);
	}
}
class Library{
	public static void main(String[]args)	
	{
		Lib ob=new Lib();
		ob.input();
		ob.cal();
		ob.display();	
	}
}