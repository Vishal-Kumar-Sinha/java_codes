import java.util.Scanner;
import java.text.DecimalFormat;
class Laptop{
	private String name;
	private double price,dis,amt;
	Laptop(){
		this.name=name;
		this.price=price;
		price=0.0d;
		dis=0.0d;
		amt=0.0d;
	}
	void setDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter customer name :: ");
		name=sc.nextLine();
		System.out.print("Enter laptop price :: Rs. ");
		price=sc.nextDouble();
	}
	void Discount(){
		if(price>0 && price<=25000){
			dis=price*0.05;
			amt=price-dis;
		}
		else if(price>25000 && price<=50000){
			dis=price*0.075;
			amt=price-dis;
		}
		else if(price>50000 && price<=100000){
			dis=price*0.1;
			amt=price-dis;
		}
		else if(price>100000){
			dis=price*0.15;
			amt=price-dis;
		}
		else
			System.out.println("***INVALID INPUT PRICE***");
	}
	void Display(){
		DecimalFormat d=new DecimalFormat("0.00");
		System.out.println("\n\n----------------------------------------");
		System.out.println("Customer name  :: "+name+"\nLaptop price   :: Rs. "+d.format(price)+"\nDiscount price :: Rs. "+d.format(dis)+"\nTotal amount   :: Rs. "+d.format(amt));
		System.out.println("----------------------------------------");
	}
}
class pg3{
	public static void main(String[]args){
		Laptop l=new Laptop();
		l.setDetails();
		l.Discount();
		l.Display();
	}
}