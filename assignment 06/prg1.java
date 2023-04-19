import java.util.Scanner;
class Juice{
	private int code,size,price;
	String flavour,pack;
	Juice(){
		code=0;
		size=0;
		price=0;
		flavour="";
		pack="";
	}
	void input(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter product code :: ");
		code=sc.nextInt();
		System.out.print("Enter product flavour :: ");
		flavour=sc.next();
		System.out.print("Enter product pack type :: ");
		pack=sc.next();
		System.out.print("Enter product size (ml) :: ");
		size=sc.nextInt();
		System.out.print("Enter product price :: Rs. ");
		price=sc.nextInt();
	}
	void discount(){
		price=price-10;
	}
	void display(){
		System.out.println("\n\nProduct code     :: "+code+"\nProduct flavour  :: "+flavour+"\nProduct package  :: "+pack+"\nProduct size     :: "+size+" ml\nDiscounted price :: Rs. "+price);
	}
}
class prg1{
	public static void main(String[]args){
		Juice j=new Juice();
		j.input();
		j.discount();
		j.display();
	}
}