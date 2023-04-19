import java.util.Scanner;
class Bazar{
	private int price;
	void getPrice(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter price :: Rs. ");
		price=sc.nextInt();
	}
	int Discount(int rate){
		price=price-(price*rate/100);
		return price;
	}
	int Discount(int r1,int r2){
		price=price-(price*r1/100);
		price=price-(price*r2/100);
		return price;
	}
	int Discount(int r1,int r2,int r3){
		price=price-(price*r1/100);
		price=price-(price*r2/100);
		price=price-(price*r3/100);
		return price;
	}
	void Discountprice(){
		System.out.println("Discounted price :: Rs. "+price);
	}
}
class pg1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Bazar a=new Bazar();
		a.getPrice();
		System.out.println("Enter discount number :: ");
		int n=sc.nextInt();
		if(n==1){
			System.out.println("Enter discount rate :: ");
			int r1=sc.nextInt();
			a.Discount(r1);
			a.Discountprice();
		}
		else if(n==2){
			System.out.println("Enter discount rates :: ");
			int r1=sc.nextInt();
			int r2=sc.nextInt();
			a.Discount(r1,r2);
			a.Discountprice();
		}
		else if(n==3){
			System.out.println("Enter discount rates :: ");
			int r1=sc.nextInt();
			int r2=sc.nextInt();
			int r3=sc.nextInt();
			a.Discount(r1,r2,r3);
			a.Discountprice();
		}
		else{
			System.out.println("Error!!");
		}
	}
}